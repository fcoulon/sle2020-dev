package Nabla;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureStructure;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class JsonHelper {
	
	public static JSONObject convert(IFeatureModel fm) {
		
		JSONObject node = convert(fm.getStructure().getRoot());
		JSONObject root = new JSONObject();
		root.put("tree", node);
		
		return root;
	}
	
	public static JSONObject convert(IFeatureStructure feat) {
		
		List<JSONObject> children = new ArrayList<>();
		for(IFeatureStructure child : feat.getChildren()) {
			JSONObject childNode = convert(child);
			children.add(childNode);
		}
				
		JSONObject node = new JSONObject();
		node.put("name", feat.getFeature().getName());
		node.put("children", children);
		
		return node;
	}
	
}