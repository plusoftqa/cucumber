package steps_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.PageLoginOmni;

public class StepLoginOmni {
	PageLoginOmni login = new PageLoginOmni();
	@Given ("Abrir brownser")
	public void brownser() {
		
		login.abrirNavegador();
		//System.out.println("abrir navegador");
	}
	
	@And("^Acessar Sistema com o usuario \"([^\"]*)\" e senha \"([^\"]*)\"$")
	public void acessarOmni(String user, String password) throws Exception {
		
		login.acessarOmni(user, password);
	}
}
