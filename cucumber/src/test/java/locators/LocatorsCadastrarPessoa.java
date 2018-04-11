package locators;

import org.openqa.selenium.By;

public class LocatorsCadastrarPessoa {
	
	protected By BotaoNovoAtendimento = By.id("btn-new-ticket");
	protected By IdentificarPessoa = By.cssSelector("button[id='btn-person-identification']");
	protected By Novo = By.cssSelector("button[data-original-title='Novo'");
	public By Gerar_protocolo = By.cssSelector("button[id='btn-save-ticket']");
	public By mais = By.linkText("mais");
	public By ocorrencia = By.linkText("Ocorrência");
	
	//Dados da pessoa
	protected By nome_Razao_type = By.id("txt-person-name");
	protected By tratamento_select = By.id("cmb-person-persontitle");
	protected By apelido_type = By.id("txt-person-nickname");
	protected By codigo_type = By.id("txt-person-id");
	protected By codigo_corporativo_type = By.id("txt-person-integration");
	protected By tipo_da_pessoa_select = By.id("tcmb-person-persontype-do");
	protected By tipo_de_publico_select = By.id("txt-person-name");
	protected By genero_select = By.id("txt-person-name");
	protected By estado_civil_select = By.id("txt-person-name");
	protected By por_telefone_checkbox = By.id("txt-person-name");
	protected By por_correio_checkbox = By.id("txt-person-name");
	protected By por_email_checkbox = By.id("txt-person-name");
	protected By sms_checkbox = By.id("txt-person-name");
	protected By telefone_residencial_DDI_type = By.id("txt-person-name");
	protected By telefone_residencial_DDD_type = By.id("txt-person-name");
	protected By telefone_residencial_telefone_type = By.id("txt-person-name");
	protected By telefone_residencial_complemento_type = By.id("txt-person-name");
	protected By telefone_celular_DDI_type = By.id("txt-person-name");
	protected By telefone_celular_DDD_type = By.id("txt-person-name");
	protected By telefone_celular_telefone_type = By.id("txt-person-name");
	protected By telefone_celular_complemento_type = By.id("txt-person-name");
	protected By telefone_comercial_DDI_type = By.id("txt-person-name");
	protected By telefone_comercial_DDD_type = By.id("txt-person-name");
	protected By telefone_comercial_telefone_type = By.id("txt-person-name");
	protected By telefone_comercial_complemento_type = By.id("txt-person-name");
	protected By email_principal_type = By.id("txt-person-name");
	protected By email_aletrnativo_type = By.id("txt-person-name");
	protected By facebook_type = By.id("txt-person-name");
	protected By instagram_type = By.id("txt-person-name");
	protected By linkedin_type = By.id("txt-person-name");
	protected By twitter_type = By.id("txt-person-name");
	protected By inativo_checkbox = By.id("txt-person-name");

	


}
