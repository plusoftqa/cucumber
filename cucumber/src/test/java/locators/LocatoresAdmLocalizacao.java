package locators;

import org.openqa.selenium.By;

public class LocatoresAdmLocalizacao {
	
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
	
	

}
