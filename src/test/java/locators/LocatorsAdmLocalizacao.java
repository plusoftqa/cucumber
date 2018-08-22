package locators;

import org.openqa.selenium.By;

public class LocatorsAdmLocalizacao {
	
	//Localização Paises
	protected By paises_abreviacao_type = By.id("field-abreviation");
	protected By paises_pais_type = By.id("field-country");
	protected By paises_cod_pais_type = By.id("field-contrycode");
	
	// Localização > Regioes
	protected By regioes_type = By.id("field-region");
	
	//Localizacao > Estados
	protected By Estados_estado_type = By.id("field-state");
	protected By Estados_pais_select = By.id("field-countryid");
	protected By Estados_regiao_select = By.id("field-regionid");
	
	
	// Localizacao > Cidades
	protected By Cidade_estado_select = By.id("field-stateid");
	protected By Cidade_Codigo_da_cidade_type = By.id("field-citycode");
	protected By Cidade_cidades_type = By.id("field-city");
	
	// Localizacao > Tipos de endereço
	protected By Tipos_de_endereco_type = By.id("field-tpaddress");
	
	// Localizacao > Tipos de logradouro
	protected By Tipos_de_logradouro_type = By.id("field-typestreet");

}
