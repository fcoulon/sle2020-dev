package fr.inria.diverse.socket;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.DocumentFormattingParams;
import org.eclipse.lsp4j.FormattingOptions;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.MessageActionItem;
import org.eclipse.lsp4j.MessageParams;
import org.eclipse.lsp4j.PublishDiagnosticsParams;
import org.eclipse.lsp4j.ShowMessageRequestParams;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;

import fr.cea.nabla.ide.NablaLSPModule;

public class NablaServerMain {

	public static void main(String[] args) {
		try {
			LanguageServerImpl server = new NablaLSPModule().createInjectorAndDoEMFRegistration().getInstance(LanguageServerImpl.class);
			
			LanguageClient mockClient = new LanguageClient() {
				@Override
				public void telemetryEvent(Object object) {
				}

				@Override
				public void publishDiagnostics(PublishDiagnosticsParams diagnostics) {
					System.out.println("Diag !");
					synchronized (server) {
						server.notify();
					}
				}

				@Override
				public void showMessage(MessageParams messageParams) {
				}

				@Override
				public CompletableFuture<MessageActionItem> showMessageRequest(ShowMessageRequestParams requestParams) {
					return null;
				}

				@Override
				public void logMessage(MessageParams message) {
				}
			};

			server.connect(mockClient);

			InitializeParams initParam = new InitializeParams();
			server.initialize(initParam);
			server.initialized(new InitializedParams());
			
			DidOpenTextDocumentParams openParam = new DidOpenTextDocumentParams(
					new TextDocumentItem("inmemory:/Glace2d_1.nabla", "nabla", 1, "module Glace2d;\n" + 
							"\n" + 
							"with Math.*;\n" + 
							"\n" + 
							"connectivities {\n" + 
							"	nodes1: (∅) → {node};\n" + 
							"	cells1: (∅) → {cell};\n" + 
							"	outerFaces1: (∅) → {face};\n" + 
							"	innerNodes1: (∅) → {node};\n" + 
							"	nodesOfCell1: (cell) → {node};\n" + 
							"	cellsOfNode1: (node) → {cell};\n" + 
							"	nodesOfFace1: (face) → {node};\n" + 
							"}\n" + 
							"\n" + 
							"functions {\n" + 
							"	trace1: (ℝ²ˣ²) → ℝ;\n" + 
							"	perp1: (ℝ²) → ℝ²;\n" + 
							"	tensProduct1: (ℝ², ℝ²) → ℝ²ˣ²;\n" + 
							"	matVectProduct1: (ℝ²ˣ², ℝ²) → ℝ²;\n" + 
							"	inverse1: (ℝ²ˣ²) → ℝ²ˣ²;\n" + 
							"}\n" + 
							"\n" + 
							"\n" + 
							"// Options obligatoires pour générer\n" + 
							"const ℝ LENGTH1 = 0.01;\n" + 
							"const ℕ X_EDGE_ELEMS1 = 100;\n" + 
							"const ℕ Y_EDGE_ELEMS1 = 10;\n" + 
							"const ℕ Z_EDGE_ELEMS1 = 1;\n" + 
							"const ℝ option_stoptime1 = 0.2;\n" + 
							"const ℕ option_max_iterations1 = 20000;\n" + 
							"\n" + 
							"// Autres options\n" + 
							"const ℝ γ1 = 1.4;\n" + 
							"const ℝ option_x_interface1 = 0.5;\n" + 
							"const ℝ option_δt_ini1 = 1.0e-5;\n" + 
							"const ℝ option_δt_cfl1 = 0.4;\n" + 
							"const ℝ option_ρ_ini_zg1 = 1.0;\n" + 
							"const ℝ option_ρ_ini_zd1 = 0.125;\n" + 
							"const ℝ option_p_ini_zg1 = 1.0;\n" + 
							"const ℝ option_p_ini_zd1 = 0.1;\n" + 
							"\n" + 
							"ℝ t1=0.0;\n" + 
							"ℝ δt1=0.0;\n" + 
							"\n" + 
							"ℝ² coord1[nodes1], X1[nodes1], b1[nodes1], bt1[nodes1];\n" + 
							"ℝ²ˣ² Ar1[nodes1], Mt1[nodes1];\n" + 
							"ℝ² ur1[nodes1];\n" + 
							"ℝ p_ic1[cells1], ρ_ic1[cells1], V_ic1[cells1];\n" + 
							"ℝ c1[cells1], m1[cells1], p1[cells1], ρ1[cells1], e1[cells1], E1[cells1], V1[cells1];\n" + 
							"ℝ δtj1[cells1];\n" + 
							"ℝ² uj1[cells1], center1[cells1];\n" + 
							"ℝ l1[cells1, nodesOfCell1];\n" + 
							"ℝ² C_ic1[cells1, nodesOfCell1], C1[cells1, nodesOfCell1], F1[cells1, nodesOfCell1];\n" + 
							"ℝ²ˣ² Ajr1[cells1, nodesOfCell1];\n" + 
							"\n" + 
							"\n" + 
							"// *************************************************************\n" + 
							"// * Init: X_ic(par le mailleur), ρ_ic, p_ic, V_ic & m\n" + 
							"// *************************************************************\n" + 
							"IniCenter1: ∀j1∈cells1(), center1{j1} = (1.0/4.0) * ∑{r1∈nodesOfCell1(j1)}(coord1{r1});\n" + 
							"IniIc1: ∀j1∈cells1(), if (center1{j1}.x < option_x_interface1) {\n" + 
							"  ρ_ic1{j1}=option_ρ_ini_zg1;\n" + 
							"  p_ic1{j1}=option_p_ini_zg1;\n" + 
							"} else {\n" + 
							"  ρ_ic1{j1}=option_ρ_ini_zd1;\n" + 
							"  p_ic1{j1}=option_p_ini_zd1;\n" + 
							"}\n" + 
							"\n" + 
							"ComputeCjrIc1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), \n" + 
							"	C_ic1{j1,r1} = 0.5 * perp1(coord1{►(r1)} - coord1{◄(r1)});\n" + 
							"IniVIc1: ∀j1∈cells1(), V_ic1{j1} = 0.5 * ∑{r1∈nodesOfCell1(j1)}(dot(C_ic1{j1,r1}, coord1{r1}));\n" + 
							"IniM1: ∀j1∈cells1(), m1{j1} = ρ_ic1{j1} * V_ic1{j1}; // m est constant\n" + 
							"\n" + 
							"\n" + 
							"// *************************************************************\n" + 
							"// * Calcul des C{j,r} et des variables qui en découlent\n" + 
							"// *************************************************************\n" + 
							"ComputeCjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), C1{j1,r1} = 0.5 * perp1(X1{►(r1)} - X1{◄(r1)});\n" + 
							"ComputeLjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), l1{j1,r1} = norm(C1{j1,r1});\n" + 
							"Computeδtj1: ∀j1∈cells1(), δtj1{j1} = 2.0 * V1{j1} / (c1{j1} * ∑{r1∈nodesOfCell1(j1)}(l1{j1,r1}));\n" + 
							"\n" + 
							"// *************************************************************\n" + 
							"// * Règles EOS standards: m, ρ, c, p, e\n" + 
							"// *************************************************************\n" + 
							"ComputeDensity1: ∀j1∈cells1(), ρ1{j1} = m1{j1} / V1{j1};\n" + 
							"ComputeEOSp1: ∀j1∈cells1(), p1{j1} = (γ1-1.0) * ρ1{j1} * e1{j1};\n" + 
							"ComputeInternalEngergy1: ∀j1∈cells1(), e1{j1} = E1{j1} - 0.5 * dot(uj1{j1}, uj1{j1});\n" + 
							"ComputeEOSc1: ∀j1∈cells1(), c1{j1} = √(γ1*p1{j1}/ρ1{j1}); \n" + 
							"\n" + 
							"// *************************************************************\n" + 
							"// * Cell-centered Godunov Scheme for Lagragian gas dynamics\n" + 
							"// *************************************************************\n" + 
							"ComputeAjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), Ajr1{j1,r1} = ((ρ1{j1}*c1{j1})/l1{j1,r1}) * tensProduct1(C1{j1,r1}, C1{j1,r1});\n" + 
							"ComputeFjr1: ∀j1∈cells1(), ∀r1∈nodesOfCell1(j1), F1{j1,r1} = p1{j1}*C1{j1,r1} + matVectProduct1(Ajr1{j1,r1}, (uj1{j1}-ur1{r1}));\n" + 
							"ComputeAr1: ∀r1∈nodes1(), Ar1{r1} = ∑{j1∈cellsOfNode1(r1)}(Ajr1{j1,r1});\n" + 
							"ComputeBr1: ∀r1∈nodes1(), b1{r1} = ∑{j1∈cellsOfNode1(r1)}(p1{j1}*C1{j1,r1} + matVectProduct1(Ajr1{j1,r1}, uj1{j1}));\n" + 
							"ComputeMt1: ∀r1∈innerNodes1(), Mt1{r1} = Ar1{r1};\n" + 
							"ComputeBt1: ∀r1∈innerNodes1(), bt1{r1} = b1{r1};\n" + 
							"\n" + 
							"OuterFacesComputations1: ∀k1∈outerFaces1(), {\n" + 
							"	const ℝ epsilon1 = 1.0e-10;\n" + 
							"	ℝ²ˣ² I1 = {{1.0,0.0},{0.0,1.0}};\n" + 
							"\n" + 
							"	ℝ X_MIN1 = 0.0;\n" + 
							"	ℝ X_MAX1 = X_EDGE_ELEMS1 * LENGTH1;\n" + 
							"	ℝ Y_MIN1 = 0.0; \n" + 
							"	ℝ Y_MAX1 = Y_EDGE_ELEMS1 * LENGTH1;\n" + 
							"	ℝ² nY1 = {0.0,1.0};\n" + 
							"	\n" + 
							"	∀r1∈nodesOfFace1(k1), {\n" + 
							"		// Y boundary conditions (must be done before X)\n" + 
							"		if ((X1{r1}.y-Y_MIN1 < epsilon1) || (X1{r1}.y-Y_MAX1 < epsilon1)) {\n" + 
							"			ℝ sign1 = 0.0;\n" + 
							"			if (X1{r1}.y-Y_MIN1 < epsilon1) sign1 = -1.0;\n" + 
							"			else sign1 = 1.0;\n" + 
							"			ℝ² n1 = sign1 * nY1;\n" + 
							"      		ℝ²ˣ² nxn1 = tensProduct1(n1,n1);\n" + 
							"      		ℝ²ˣ² IcP1 = I1 - nxn1;\n" + 
							"			bt1{r1} = matVectProduct1(IcP1, b1{r1});\n" + 
							"			Mt1{r1} = IcP1 * (Ar1{r1} * IcP1) + nxn1*trace1(Ar1{r1});\n" + 
							"		}\n" + 
							"\n" + 
							"		// X boundary conditions\n" + 
							"		if ((Math.fabs(X1{r1}.x-X_MIN1) < epsilon1) || ( (Math.fabs(X1{r1}.x-X_MAX1) < epsilon1) )) {\n" + 
							"			Mt1{r1} = I1;\n" + 
							"			bt1{r1} = {0.0, 0.0};\n" + 
							"		}\n" + 
							"	}\n" + 
							"}\n" + 
							"\n" + 
							"\n" + 
							"ComputeU1: ∀r1∈nodes1(), ur1{r1} = matVectProduct1(inverse1(Mt1{r1}), bt1{r1});\n" + 
							"ComputeV1: ∀j1∈cells1(), V1{j1} = 0.5 * ∑{r1∈nodesOfCell1(j1)}(dot(C1{j1,r1},X1{r1}));\n" + 
							"\n" + 
							"// *************************************************************\n" + 
							"// * Itérations de la boucle en 'n'\n" + 
							"// * Et calcule du δt pour mise-à-jour du temps de la simulation\n" + 
							"// *************************************************************\n" + 
							"ComputeXn1: ∀n1∈ℕ, ∀r01∈nodes1(), X1{r01}^{n1=0}=coord1{r01}; , ∀r1∈nodes1(), X1{r1}^{n1+1}=X1{r1}^{n1}+δt1^{n1}*ur1{r1};\n" + 
							"ComputeUn1: ∀n1∈ℕ, ∀j01∈cells1(), uj1{j01}^{n1=0}={0.0,0.0}; , ∀j1∈cells1(), uj1{j1}^{n1+1}=uj1{j1}^{n1}-(δt1^{n1}/m1{j1})*∑{r1∈nodesOfCell1(j1)}(F1{j1,r1});\n" + 
							"ComputeEn1: ∀n1∈ℕ, ∀j01∈cells1(), E1{j01}^{n1=0}=p_ic1{j01}/((γ1-1.0)*ρ_ic1{j01}); , ∀j1∈cells1(), E1{j1}^{n1+1}=E1{j1}^{n1} - (δt1^{n1} / m1{j1}) * ∑{r1∈nodesOfCell1(j1)}(dot(F1{j1,r1},ur1{r1}));\n" + 
							"ComputeDt1: ∀n1∈ℕ, δt1^{n1=0}=option_δt_ini1;, δt1^{n1+1}=option_δt_cfl1*reduceMin{j1∈cells1()}(δtj1{j1});\n" + 
							"ComputeTn1: ∀n1∈ℕ, t1^{n1=0}=0.0; , t1^{n1+1}=t1^{n1}+δt1^{n1+1};\n" + 
							"\n" + 
							""));
			server.didOpen(openParam);
			
//			DocumentFormattingParams formatParam = new DocumentFormattingParams(new TextDocumentIdentifier("inmemory:/Glace2d_1.nabla"), new FormattingOptions());
//			CompletableFuture<List<? extends TextEdit>> replyFormat = server.formatting(formatParam);
//			System.out.println(replyFormat.get());
			
			synchronized (server) {
				server.wait();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("DONE");
	}
	
}
