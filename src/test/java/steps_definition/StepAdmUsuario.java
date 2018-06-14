package steps_definition;

import cucumber.api.java.en.And;
import executar.Util;
import pages.PageAdmUsuario;

public class StepAdmUsuario {
	Util u = new Util();
	PageAdmUsuario usuario = new PageAdmUsuario();
	@And("^Incluir Grupo de usuarios\"([^\"]*)\"$")
	public void incluir_Grupo_de_usuarios(String Descricao) throws Exception {
		usuario.incluir_Grupo_de_usuarios(Descricao);		
	    
	   
	}
	
	@And("^Digitar descricao grupo de usuario \"([^\"]*)\"$")
	public void digitar_descricao_grupo_de_usuario(String descricao) throws Exception {
	  usuario.digitar_descricao_grupo_de_usuario (descricao);
	}

	@And("^Selecionar modulo grupo de usuarios \"([^\"]*)\"$")
	public void selecionar_modulo_grupo_de_usuarios(String modulo) throws Exception {
	   usuario.selecionar_modulo_grupo_de_usuarios(modulo);
	    
	}
	
	@And("^Selecionar usuario grupo de usuarios \"([^\"]*)\"$")
	public void selecionar_usuario_grupo_de_usuarios(String usuarios) throws Exception {
		usuario.selecionar_usuario_grupo_de_usuarios(usuarios);
	    
	}
	
	@And("^Incluir Time\"([^\"]*)\"$")
	public void incluir_Time(String time) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    usuario.incluir_Time(time);
	}
	
	@And("^Digitar Time \"([^\"]*)\"$")
	public void digitar_Time(String time) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    usuario.digitar_Time(time);
	}

	@And("^Digitar E-mail \"([^\"]*)\"$")
	public void digitar_E_mail(String email) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		usuario.digitar_E_mail(email);
	}
	
	@And("^checkbox Time destinatario$")
	public void checkbox_Time_destinatario() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		usuario.checkbox_Time_destinatario();
	    
	}
	
	

	@And("^Digitar Departamento \"([^\"]*)\"$")
	public void digitar_Departamento(String departamento) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    usuario.digitar_Departamento(departamento);
	}



}
