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
		u.driver.findElement(descricao_grupo_de_usuarios_type).clear();
		u.Digitar(descricao_grupo_de_usuarios_type, descricao);
		
	}
	public void selecionar_modulo_grupo_de_usuarios(String modulo) {
		u.selectMenuAdm(modulo_grupo_de_usuarios_select, modulo);
	
		
	}
	public void selecionar_usuario_grupo_de_usuarios(String usuarios) {
		u.selectMenuAdm(usuario_grupo_de_usuarios_select, usuarios);
		
	}
	
	

}
