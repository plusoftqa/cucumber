package locators;

import org.openqa.selenium.By;

public class LocatorsAdmPessoa {
	
	//CARGO
	protected By cargo_type = By.id("field-jobtitlename");
	
	//Profissao
	protected By profissao_type = By.id("field-jobname");
	
	//Estado Civil
	protected By estado_civil_type = By.id("field-maritalstatusname");
	
	// Relacoes entre as pessoas
	protected By relacoes_entre_as_pessoas_type = By.id("field-personrelationtype");
	
	// Formas de tratamento
	protected By formas_de_tratamento_type = By.id("field-persontitle");
	
	// Segmentos empresarial
	protected By segmentos_empresarial_type = By.id("field-corporatesegmentname");
	
	//Tipos de publico
	protected By tipos_de_publico_type = By.id("field-persontypename");
	protected String tipos_de_publico_Visivel_em_pessoa_checkbox = "field-personvalid";
	protected String tipos_de_publico_Visivel_em_contato_checkbox = "field-contactvalid";
	
	//Pessoa nao identificada
	protected By pessoa_nao_identificada_type = By.id("field-personnotinformed");
	protected By pessoa_nao_identificada_pessoa_number = By.id("field-person");
	
	//Tipo de origem
	protected By tipos_de_origem_type = By.id("field-personorigintypename");
	
	//Origens
	protected By origem_type = By.id("field-personoriginname");
	protected By origem_tipo_de_origem_select = By.id("field-personorigintypeid");
	
	//Status
	protected By status_type = By.id("field-personstatusname");
	
	//Classificacoes
	protected By classificacoes_type = By.id("field-personclassificationname");
	
	//Portes
	protected By portes_type = By.id("field-personcompanysizename");
	
	//Unificacao Cadastral
	
	
	
	
	
	

}
