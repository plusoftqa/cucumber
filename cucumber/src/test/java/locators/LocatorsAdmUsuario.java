package locators;

import org.openqa.selenium.By;

public class LocatorsAdmUsuario {
	//grupos de usuários
	protected By descricao_grupo_de_usuarios_type = By.name("input-core_usergroup-ds_usergroup");
	protected By modulo_grupo_de_usuarios_select = By.name("cmb-module-id");
	protected By usuario_grupo_de_usuarios_select = By.xpath("//*[@class='modal-content']//*[@id='input-core_usergroup_users-id_users']");
	
	//times
	protected By time_times_type = By.id("field-teamname");
	protected By email_times_email = By.id("field-emailaddress");
	protected String time_destinatatio_times_checkbox = "field-receiver";
	protected By codigo_usuario_crm_times_select = By.xpath("//*[@class='modal-content']//*[@id='field-crmuserid']");
	protected String resolvedor_times_checkbox = "field-resolve";
	protected String ver_times_checkbox = "field-opportunityview";
	protected String editar_times_checkbox = "field-opportunityedit";
	protected String responsavel_times_checkbox = "field-opportunityadmin";
	
	
	//departamento
	protected By departamento_type = By.id("field-department");
	
	
	
	

}
