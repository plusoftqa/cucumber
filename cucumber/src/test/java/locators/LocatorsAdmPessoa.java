package locators;

import org.openqa.selenium.By;

public class LocatorsAdmPessoa {
	
	protected String Menu = "li[role=user-menu]";
	protected String ModuloADM = "a[href*='?m=menu.admin']";
	protected String ModuloCallCenter = "a[href*='?m=menu.main.callcenter']";
	protected String MenuPessoa = "li[data-menu-id='menu.admin.person']";
	protected String SubmenuCargo = "a[href='/forms-v2/finder/CRM_JOBTITLE']";
	protected By DigitarCargo = By.id("field-jobtitlename");

}
