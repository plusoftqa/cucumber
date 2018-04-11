package steps_definition;

import cucumber.api.java.en.Given;
import pages.PageCriarOcorrencia;

public class StepCriarOcorrencia {
	PageCriarOcorrencia ocorrencia = new PageCriarOcorrencia();

	@Given("^Gerar Protocolo$")
	public void gerar_Protocolo() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ocorrencia.gerarProtocolo();
	    
	}

	@Given("^Abrir ocorrencia$")
	public void abrir_ocorrencia() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		ocorrencia.abrirOcorrencia();
	    
	}

	@Given("^Preencher todos os campos obrigatorios$")
	public void preencher_todos_os_campos_obrigatorios() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ocorrencia.preenchercamposobrigatorios();
	   
	}

	@Given("^Criar um follow up$")
	public void criar_um_follow_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ocorrencia.criarfollowup();
	   
	}

	@Given("^Salvar ocorrencia$")
	public void salvar_ocorrencia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ocorrencia.salvarOcorrencia();
	   
	}

	@Given("^Verifica codigo de ocorrencia$")
	public void verifica_codigo_de_ocorrencia() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ocorrencia.verificarCodigo();
	    
	}


}
