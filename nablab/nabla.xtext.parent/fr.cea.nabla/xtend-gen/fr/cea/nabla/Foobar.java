package fr.cea.nabla;

import com.google.inject.Injector;
import fr.cea.nabla.NablaStandaloneSetupGenerated;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.impl.RootNode;
import org.eclipse.xtext.nodemodel.impl.SerializableNodeModel;
import org.eclipse.xtext.nodemodel.serialization.DeserializationConversionContext;
import org.eclipse.xtext.nodemodel.serialization.SerializationConversionContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Foobar {
  public static void main(final String[] args) {
    try {
      final Injector injector = new NablaStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
      final ResourceSetImpl rs = new ResourceSetImpl();
      Resource _createResource = rs.createResource(URI.createURI("inmemory:/foobar.nabla"));
      final XtextResource res = ((XtextResource) _createResource);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module Glace2d;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("with Math.*;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("connectivities {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("nodes1: (∅) → {node};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("cells1: (∅) → {cell};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("outerFaces1: (∅) → {face};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("innerNodes1: (∅) → {node};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("nodesOfCell1: (cell) → {node};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("cellsOfNode1: (node) → {cell};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("nodesOfFace1: (face) → {node};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("functions {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("trace1: (ℝ²ˣ²) → ℝ;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("perp1: (ℝ²) → ℝ²;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("tensProduct1: (ℝ², ℝ²) → ℝ²ˣ²;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("matVectProduct1: (ℝ²ˣ², ℝ²) → ℝ²;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("inverse1: (ℝ²ˣ²) → ℝ²ˣ²;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// Options obligatoires pour générer");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ LENGTH1 = 0.01;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℕ X_EDGE_ELEMS1 = 100;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℕ Y_EDGE_ELEMS1 = 10;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℕ Z_EDGE_ELEMS1 = 1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_stoptime1 = 0.2;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℕ option_max_iterations1 = 20000;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// Autres options");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ γ1 = 1.4;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_x_interface1 = 0.5;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_δt_ini1 = 1.0e-5;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_δt_cfl1 = 0.4;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_ρ_ini_zg1 = 1.0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_ρ_ini_zd1 = 0.125;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_p_ini_zg1 = 1.0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("const ℝ option_p_ini_zd1 = 0.1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ t1=0.0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ δt1=0.0;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ² coord1[nodes1], X1[nodes1], b1[nodes1], bt1[nodes1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ²ˣ² Ar1[nodes1], Mt1[nodes1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ² ur1[nodes1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ p_ic1[cells1], ρ_ic1[cells1], V_ic1[cells1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ c1[cells1], m1[cells1], p1[cells1], ρ1[cells1], e1[cells1], E1[cells1], V1[cells1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ δtj1[cells1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ² uj1[cells1], center1[cells1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ l1[cells1, nodesOfCell1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ² C_ic1[cells1, nodesOfCell1], C1[cells1, nodesOfCell1], F1[cells1, nodesOfCell1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ℝ²ˣ² Ajr1[cells1, nodesOfCell1];");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// * Init: X_ic(par le mailleur), ρ_ic, p_ic, V_ic & m");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("IniCenter1: ∀j1∈cells1(), center1{j1} = (1.0/4.0) * ∑{r1∈nodesOfCell1(j1)}(coord1{r1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("IniIc1: ∀j1∈cells1(), if (center1{j1}.x < option_x_interface1) {");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("ρ_ic1{j1}=option_ρ_ini_zg1;");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("p_ic1{j1}=option_p_ini_zg1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} else {");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("ρ_ic1{j1}=option_ρ_ini_zd1;");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("p_ic1{j1}=option_p_ini_zd1;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeCjrIc1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("C_ic1{j1,r1} = 0.5 * perp1(coord1{►(r1)} - coord1{◄(r1)});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("IniVIc1: ∀j1∈cells1(), V_ic1{j1} = 0.5 * ∑{r1∈nodesOfCell1(j1)}(dot(C_ic1{j1,r1}, coord1{r1}));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("IniM1: ∀j1∈cells1(), m1{j1} = ρ_ic1{j1} * V_ic1{j1}; // m est constant");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// * Calcul des C{j,r} et des variables qui en découlent");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeCjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), C1{j1,r1} = 0.5 * perp1(X1{►(r1)} - X1{◄(r1)});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeLjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), l1{j1,r1} = norm(C1{j1,r1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Computeδtj1: ∀j1∈cells1(), δtj1{j1} = 2.0 * V1{j1} / (c1{j1} * ∑{r1∈nodesOfCell1(j1)}(l1{j1,r1}));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// * Règles EOS standards: m, ρ, c, p, e");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeDensity1: ∀j1∈cells1(), ρ1{j1} = m1{j1} / V1{j1};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeEOSp1: ∀j1∈cells1(), p1{j1} = (γ1-1.0) * ρ1{j1} * e1{j1};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeInternalEngergy1: ∀j1∈cells1(), e1{j1} = E1{j1} - 0.5 * dot(uj1{j1}, uj1{j1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeEOSc1: ∀j1∈cells1(), c1{j1} = √(γ1*p1{j1}/ρ1{j1}); ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// * Cell-centered Godunov Scheme for Lagragian gas dynamics");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeAjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), Ajr1{j1,r1} = ((ρ1{j1}*c1{j1})/l1{j1,r1}) * tensProduct1(C1{j1,r1}, C1{j1,r1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeFjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), F1{j1,r1} = p1{j1}*C1{j1,r1} + matVectProduct1(Ajr1{j1,r1}, (uj1{j1}-ur1{r1}));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeAr1: ∀r1∈nodes1(), Ar1{r1} = ∑{j1∈cellsOfNode1(r1)}(Ajr1{j1,r1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeBr1: ∀r1∈nodes1(), b1{r1} = ∑{j1∈cellsOfNode1(r1)}(p1{j1}*C1{j1,r1} + matVectProduct1(Ajr1{j1,r1}, uj1{j1}));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeMt1: ∀r1∈innerNodes1(), Mt1{r1} = Ar1{r1};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeBt1: ∀r1∈innerNodes1(), bt1{r1} = b1{r1};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("OuterFacesComputations1: ∀k1∈outerFaces1(), {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("const ℝ epsilon1 = 1.0e-10;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ℝ²ˣ² I1 = {{1.0,0.0},{0.0,1.0}};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ℝ X_MIN1 = 0.0;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ℝ X_MAX1 = X_EDGE_ELEMS1 * LENGTH1;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ℝ Y_MIN1 = 0.0; ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ℝ Y_MAX1 = Y_EDGE_ELEMS1 * LENGTH1;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ℝ² nY1 = {0.0,1.0};");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("∀r1∈nodesOfFace1(k1), {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("// Y boundary conditions (must be done before X)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if ((X1{r1}.y-Y_MIN1 < epsilon1) || (X1{r1}.y-Y_MAX1 < epsilon1)) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ℝ sign1 = 0.0;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("if (X1{r1}.y-Y_MIN1 < epsilon1) sign1 = -1.0;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("else sign1 = 1.0;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("ℝ² n1 = sign1 * nY1;");
      _builder.newLine();
      _builder.append("\t\t      \t\t");
      _builder.append("ℝ²ˣ² nxn1 = tensProduct1(n1,n1);");
      _builder.newLine();
      _builder.append("\t\t      \t\t");
      _builder.append("ℝ²ˣ² IcP1 = I1 - nxn1;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("bt1{r1} = matVectProduct1(IcP1, b1{r1});");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Mt1{r1} = IcP1 * (Ar1{r1} * IcP1) + nxn1*trace1(Ar1{r1});");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("// X boundary conditions");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("if ((Math.fabs(X1{r1}.x-X_MIN1) < epsilon1) || ( (Math.fabs(X1{r1}.x-X_MAX1) < epsilon1) )) {");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("Mt1{r1} = I1;");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("bt1{r1} = {0.0, 0.0};");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeU1: ∀r1∈nodes1(), ur1{r1} = matVectProduct1(inverse1(Mt1{r1}), bt1{r1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeV1: ∀j1∈cells1(), V1{j1} = 0.5 * ∑{r1∈nodesOfCell1(j1)}(dot(C1{j1,r1},X1{r1}));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// * Itérations de la boucle en \'n\'");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// * Et calcule du δt pour mise-à-jour du temps de la simulation");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// *************************************************************");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeXn1: ∀n1∈ℕ, ∀r01∈nodes1(), X1{r01}^{n1=0}=coord1{r01}; , ∀r1∈nodes1(), X1{r1}^{n1+1}=X1{r1}^{n1}+δt1^{n1}*ur1{r1};");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeUn1: ∀n1∈ℕ, ∀j01∈cells1(), uj1{j01}^{n1=0}={0.0,0.0}; , ∀j1∈cells1(), uj1{j1}^{n1+1}=uj1{j1}^{n1}-(δt1^{n1");
      _builder.append("}/m1{j1})*∑{r1∈nodesOfCell1(j1)}(F1{j1,r1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeEn1: ∀n1∈ℕ, ∀j01∈cells1(), E1{j01}^{n1=0}=p_ic1{j01}/((γ1-1.0)*ρ_ic1{j01}); , ∀j1∈cells1(), E1{j1}^{n1+1}=E1{j1}^{n1} - (δt1^{n1} / m1{j1}) * ∑{r1∈nodesOfCell1(j1)}(dot(F1{j1,r1},ur1{r1}));");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeDt1: ∀n1∈ℕ, δt1^{n1=0}=option_δt_ini1;, δt1^{n1+1}=option_δt_cfl1*reduceMin{j1∈cells1()}(δtj1{j1});");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ComputeTn1: ∀n1∈ℕ, t1^{n1=0}=0.0; , t1^{n1+1}=t1^{n1}+δt1^{n1+1};");
      _builder.newLine();
      final String initialString = _builder.toString();
      byte[] _bytes = initialString.getBytes();
      final ByteArrayInputStream targetStream = new ByteArrayInputStream(_bytes);
      res.load(targetStream, null);
      ICompositeNode _rootNode = res.getParseResult().getRootNode();
      final RootNode root = ((RootNode) _rootNode);
      final ByteArrayOutputStream out = new ByteArrayOutputStream();
      final DataOutputStream dos = new DataOutputStream(out);
      final SerializableNodeModel serializer = new SerializableNodeModel(res);
      final SerializationConversionContext ctx = new SerializationConversionContext(res);
      serializer.writeObjectData(dos, ctx);
      Resource _createResource_1 = rs.createResource(URI.createURI("inmemory:/foobar2.nabla"));
      final XtextResource res2 = ((XtextResource) _createResource_1);
      byte[] _byteArray = out.toByteArray();
      final ByteArrayInputStream in = new ByteArrayInputStream(_byteArray);
      final DataInputStream dis = new DataInputStream(in);
      final DeserializationConversionContext ctx2 = new DeserializationConversionContext(res2, "foobar");
      final SerializableNodeModel serializer2 = new SerializableNodeModel(res2);
      serializer2.readObjectData(dis, ctx2);
      InputOutput.<EList<EObject>>println(res.getContents());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}