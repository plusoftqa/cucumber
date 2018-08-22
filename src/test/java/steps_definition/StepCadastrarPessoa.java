package steps_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.PageCadastrarPessoa;

public class StepCadastrarPessoa {
	
	PageCadastrarPessoa callcenter = new PageCadastrarPessoa();
	
	@Given("^Clicar botao Novo Atendimento$")
	public void clicar_botao_Novo_Atendimento() throws Exception  {
		callcenter.botaoNovoAtendimento();
		
	  
	}

	@Given("^Clicar botao Identificar Pessoa e acionar botao novo$")
	public void clicar_botao_Identificar_Pessoa_e_acionar_botao_novo() throws Throwable {
		callcenter.incluirNovaPessoa();
	
	}

	@Given("^Preencher Campos Obrigatorios$")
	public void preencher_Campos_Obrigatorios() throws Throwable {
		callcenter.preencherCamposObrigatorios();
	  
	}

	@Given("^Clicar botao Salvar$")
	public void clicar_botao_Salvar() throws Throwable {
		callcenter.salvar();
	
	}

	@Then("^Cliente incluido com sucesso$")
	public void cliente_incluido_com_sucesso() throws Throwable {
		callcenter.msgSucesso();
	  
	}
	
	

}
