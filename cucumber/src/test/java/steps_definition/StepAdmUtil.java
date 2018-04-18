package steps_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.PageUtilAdm;

public class StepAdmUtil {
	
	PageUtilAdm util = new PageUtilAdm();
	
	@Given("^Acessar modulo \"([^\"]*)\"$")
	public void acessar_modulo(String modulo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  util.acessar_modulo(modulo);
	}
	
	@Given("^Digitar no campo de busca \"([^\"]*)\"$")
	public void digitar_no_campo_de_busca(String busca) throws Throwable {
		util.digitar_no_campo_de_busca(busca);
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Given("^Digitar no campo de busca v1 \"([^\"]*)\"$")
	public void digitar_no_campo_de_busca_v1(String busca) throws Exception {
		util.digitar_no_campo_de_busca_v1(busca);
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
	
	@Given("^Acessar menu \"([^\"]*)\"$")
	public void acessar_menu(String menu) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		util.acessar_menu(menu);
	  
	}


	@Given("^Acessar sub-menu \"([^\"]*)\"$")
	public void acessar_sub_menu(String submenu) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		util.acessar_sub_menu(submenu);
	
	}
	
	@Given("^Clicar botao \"([^\"]*)\"$")
	public void clicar_botao(String botao) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		util.clicar_botao(botao);
	   
	}
	
	@Given("^Validar Tooltips \"([^\"]*)\"$")
	public void validar_Tooltips(String tipo) throws Exception {
	    
		util.tooltips(tipo);
	}
	
	

	
	@And("^checkbox Inativo$")
	public void checkbox_Inativo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   util.checkbox_Inativo();
	}
	

	
	@Given("^Validar Alert de Sucesso$")
	public void validar_Alert_de_Sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Given("^Validar Caminho do Menu \"([^\"]*)\"$")
	public void validar_Caminho_do_Menu(String caminho) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    util.validar_Caminho_do_Menu(caminho);
	}

	@Given("^Validar title \"([^\"]*)\"$")
	public void validar_title(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		util.validar_title(title);
	   
	}
	
	@Given("^Digitar busca \"([^\"]*)\"$")
	public void digitar_busca(String busca) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    util.digitar_busca(busca);
	}

}
