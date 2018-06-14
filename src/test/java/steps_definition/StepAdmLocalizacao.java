package steps_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import executar.Util;
import pages.PageAdmLocalizacao;

public class StepAdmLocalizacao {
	Util u = new Util();
	PageAdmLocalizacao localizacao = new PageAdmLocalizacao();
	
	@And("^Digitar Paises \"([^\"]*)\"$")
	public void digitar_Paises(String Paises) throws Exception {
	    localizacao.digitar_Paises(Paises);
	   
	}
	
	@And("^Digitar Abreviacao \"([^\"]*)\"$")
	public void digitar_Abreviacao(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		localizacao.digitar_Abreviacao(arg1);
	 
	}

	@And("^Digitar Codigo do Pais \"([^\"]*)\"$")
	public void digitar_Codigo_do_Pais(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		localizacao.digitar_Codigo_do_Pais(arg1);
	    
	}
	
	@And("^Digitar Regioes \"([^\"]*)\"$")
	public void digitar_Regioes(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		localizacao.digitar_Regioes(arg1);

	}
	
	@And("^Selecionar Pais \"([^\"]*)\"$")
	public void selecionar_Pais(String arg1) throws Exception {
	    
	    localizacao.selecionar_Pais(arg1);
	}

	@And("^Selecionar Regiao \"([^\"]*)\"$")
	public void selecionar_Regiao(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		localizacao.selecionar_Regiao(arg1);
	}

	@Given("^Digitar Estados \"([^\"]*)\"$")
	public void digitar_Estados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		localizacao.digitar_Estados(arg1);
	}
	
	@And("^Selecionar Estado \"([^\"]*)\"$")
	public void selecionar_Estado(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    localizacao.selecionar_Estado(arg1);
	}
	
	@And("^Digitar Codigo da cidade \"([^\"]*)\"$")
	public void digitar_Codigo_da_cidade(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    localizacao.digitar_Codigo_da_cidade(arg1);
	}
	
	@Given("^Digitar Cidades \"([^\"]*)\"$")
	public void digitar_Cidades(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    localizacao.digitar_Cidades(arg1);
	}
	
	@And("^Digitar Tipos de endereco \"([^\"]*)\"$")
	public void digitar_Tipos_de_endereco(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    localizacao.digitar_Tipos_de_endereco(arg1);
	}
	
	@And("^Digitar Tipos de logradouro \"([^\"]*)\"$")
	public void digitar_Tipos_de_logradouro(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 localizacao.digitar_Tipos_de_logradouro(arg1);
	}

}
