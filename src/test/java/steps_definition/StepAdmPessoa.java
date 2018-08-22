package steps_definition;

import cucumber.api.java.en.And;
import executar.Util;
import pages.PageAdmPessoa;

public class StepAdmPessoa {
	
	Util u = new Util();
	PageAdmPessoa pessoa = new PageAdmPessoa();
	
	@And("^Digitar Cargos \"([^\"]*)\"$")
	public void digitar_Cargos(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		pessoa.digitar_Cargos(arg1);
	    
	}
	
	@And("^Digitar Profissoes \"([^\"]*)\"$")
	public void digitar_Profissoes(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		pessoa.digitar_Profissoes(arg1);
	}
	
	@And("^Digitar Estado Civil \"([^\"]*)\"$")
	public void digitar_Estado_Civil(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Estado_Civil(arg1);
	}

	@And("^Digitar Relacoes entre as pessoas \"([^\"]*)\"$")
	public void digitar_Relacoes_entre_as_pessoas(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Relacoes_entre_as_pessoas(arg1);
	}
	
	@And("^Digitar Formas de tratamento \"([^\"]*)\"$")
	public void digitar_Formas_de_tratamento(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Formas_de_tratamento(arg1);
	}
	
	@And("^Digitar Segmentos empresarial \"([^\"]*)\"$")
	public void digitar_Segmentos_empresarial(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Segmentos_empresarial(arg1);
	}
	
	@And("^Digitar Tipos de publico \"([^\"]*)\"$")
	public void digitar_Tipos_de_publico(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Tipos_de_publico(arg1);
	}
	
	@And("^Checkbox Visivel em pessoa$")
	public void checkbox_Visivel_em_pessoa() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		pessoa.checkbox_Visivel_em_pessoa();
	}

	@And("^Checkbox Visivel em contato$")
	public void checkbox_Visivel_em_contato() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		pessoa.checkbox_Visivel_em_contato();
	}
	
	@And("^Digitar Pessoas nao identificadas \"([^\"]*)\"$")
	public void digitar_Pessoas_nao_identificadas(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Pessoas_nao_identificadas(arg1);
	}
	
	@And("^Digitar Pessoa \"([^\"]*)\"$")
	public void digitar_Pessoa(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Pessoa(arg1);
	}
	
	@And("^Digitar Tipos de origem \"([^\"]*)\"$")
	public void digitar_Tipos_de_origem(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Tipos_de_origem(arg1);
	}
	
	@And("^Digitar Origens \"([^\"]*)\"$")
	public void digitar_Origens(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Origens(arg1);
	}
	
	@And("^Selecionar Tipo de origem \"([^\"]*)\"$")
	public void selecionar_Tipo_de_origem(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.selecionar_Tipo_de_origem(arg1);
	}
	
	@And("^Digitar Status \"([^\"]*)\"$")
	public void digitar_Status(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Status(arg1);
	}
	
	@And("^Digitar Classificacoes \"([^\"]*)\"$")
	public void digitar_Classificacoes(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Classificacoes(arg1);
	}
	
	@And("^Digitar Portes \"([^\"]*)\"$")
	public void digitar_Portes(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    pessoa.digitar_Portes(arg1);
	}	
	
	
	
	
}
