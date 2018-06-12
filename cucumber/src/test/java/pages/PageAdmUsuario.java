package pages;

import executar.Util;
import locators.LocatorsAdmUsuario;

public class PageAdmUsuario extends LocatorsAdmUsuario {

	Util u = new Util();
	PageUtilAdm adm = new PageUtilAdm();
	public void incluir_Grupo_de_usuarios(String descricao) throws Exception {
		u.Digitar(descricao_grupo_de_usuarios_type, descricao);
		
		
		
		
		
		
		
		
		
	
		
	}
	public void digitar_descricao_grupo_de_usuario(String descricao) {
		Util.driver.findElement(descricao_grupo_de_usuarios_type).clear();
		u.Digitar(descricao_grupo_de_usuarios_type, descricao);
		
	}
	public void selecionar_modulo_grupo_de_usuarios(String modulo) {
		u.selectMenuAdm(modulo_grupo_de_usuarios_select, modulo);
	
		
	}
	public void selecionar_usuario_grupo_de_usuarios(String usuarios) {
		u.selectMenuAdm(usuario_grupo_de_usuarios_select, usuarios);
		
	}
	public void incluir_Time(String time) {
		// TODO Auto-generated method stub
		u.Digitar(time_times_type, time);
		
		
	}
	public void digitar_Time(String time) {
		Util.driver.findElement(time_times_type).clear();
		u.Digitar(time_times_type, time);
		// TODO Auto-generated method stub
		
	}
	public void digitar_E_mail(String email) {
		u.Digitar(email_times_email, email);
		// TODO Auto-generated method stub
		
	}
	public void checkbox_Time_destinatario() {
		// TODO Auto-generated method stub
		u.checkbox(time_destinatatio_times_checkbox);
		
	}
	public void digitar_Departamento(String departamento) {
		// TODO Auto-generated method stub
		Util.driver.findElement(departamento_type).clear();
		u.Digitar(departamento_type, departamento);
		
	}
	
	

	
	

}
