package steps_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import executar.Util;
import pages.PageAdmAtendimento;

public class StepAdmAtendimento {
	Util u = new Util();
	PageAdmAtendimento atendimento = new PageAdmAtendimento();
	
	@And("^Digitar Como localizou \"([^\"]*)\"$")
	public void digitar_Como_localizou(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    atendimento.digitar_Como_localizou(arg1);
	}
	
	@And("^Digitar Midia \"([^\"]*)\"$")
	public void digitar_Midia(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		atendimento.digitar_Midia(arg1);
	}

	@And("^Select Como localizou \"([^\"]*)\"$")
	public void select_Como_localizou(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		atendimento.select_Como_localizou(arg1);
	}
	
	@Given("^Digitar Tipo de retorno \"([^\"]*)\"$")
	public void digitar_Tipo_de_retorno(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		atendimento.digitar_Tipo_de_retorno(arg1);
	}

	@Given("^Select Forma de retorno \"([^\"]*)\"$")
	public void select_Forma_de_retorno(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   atendimento.select_Forma_de_retorno(arg1);
	}
	
	@And("^Digitar Estado de animo \"([^\"]*)\"$")
	public void digitar_Estado_de_animo(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		atendimento.digitar_Estado_de_animo(arg1);
	   
	}
	
	@And("^Digitar Formas de contato \"([^\"]*)\"$")
	public void digitar_Formas_de_contato(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		atendimento.digitar_Formas_de_contato(arg1);
	}

}
