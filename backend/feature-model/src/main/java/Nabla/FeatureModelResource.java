package Nabla;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.ovgu.featureide.fm.core.ExtensionManager.NoSuchExtensionException;
import de.ovgu.featureide.fm.core.FeatureModelAnalyzer;
import de.ovgu.featureide.fm.core.analysis.cnf.formula.FeatureModelFormula;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.FMFactoryManager;
import de.ovgu.featureide.fm.core.base.impl.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.ConfigurationPropagator;
import de.ovgu.featureide.fm.core.configuration.DefaultFormat;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelFormat;

@Path("/")
public class FeatureModelResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("model")
    public String getFeatureModel() {
    	
    	Optional<IFeatureModel> fm = loadFm();
    	
    	if(fm.isPresent()) {
    		return JsonHelper.convert(fm.get()).toString();
    	}
    	else {
    		return "";
    	}
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("configuration")
    public String validate(String configuration) {
    	
    	Optional<IFeatureModel> fm = loadFm();
    	if(fm.isPresent()) {
    		FeatureModelFormula formula = new FeatureModelFormula(fm.get());
			Configuration config = new Configuration(formula);
			DefaultFormat r = new DefaultFormat();
    		r.read(config, configuration);
    		ConfigurationPropagator confPropagator = new ConfigurationPropagator(formula, config);
    		return String.valueOf(confPropagator.isValid().execute(null));
    	}
    	return "false";
    }
    
    protected Optional<IFeatureModel> loadFm() {
    	
    	InputStream in = getClass().getResourceAsStream("/model/model.xml"); 
    	BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    	StringBuilder builder = new StringBuilder();
    	String line;
        try {
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append("\n");
			}
		} catch (IOException e1) {
			e1.printStackTrace();
			return Optional.empty();
		}
        
        String xmlContent = builder.toString();
        return Optional.ofNullable(loadFromXml(xmlContent));
    	
//    	ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource("model/model.xml").getFile());
//        java.nio.file.Path modelFile = java.nio.file.Paths.get(file.getAbsolutePath());
//        try {
//			String xmlContent = new String(Files.readAllBytes(modelFile));
//			return Optional.of(loadFromXml(xmlContent));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//        System.out.println(file.getAbsolutePath());
////        System.out.println(file.toURI().toString());
//		return FeatureModelManager.load(modelFile).getObject();
//        return Optional.empty();
    }
    
    protected IFeatureModel loadFromXml(String xml) {
    	XmlFeatureModelFormat format = new XmlFeatureModelFormat();
		try {
			
			DefaultFeatureModelFactory fmFactory = DefaultFeatureModelFactory.getInstance();
			FeatureModel fm = fmFactory.create();
//			IFeatureModel fm = FMFactoryManager.getDefaultFactoryForFormat(format).createFeatureModel();
			if (format.read(fm, xml).containsError()) {
				//fail();
			}
			else {
				return fm;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

    }
    
}