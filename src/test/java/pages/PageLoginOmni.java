package pages;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import executar.Util;
import locators.LocatorsLoginOmni;

public class PageLoginOmni extends LocatorsLoginOmni{
	static  executar.Util u = new executar.Util();
	static String Browser = "C:\\Automacao\\browser\\";

	@SuppressWarnings("deprecation")
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", Browser
				+ "chromedriver.exe");
		
		 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  
		        capabilities.setCapability("chrome.switches",
		        Arrays.asList("--no-default-browser-check"));
		  
		       HashMap<String, String> chromePreferences = new HashMap<String, String>();
		        chromePreferences.put("profile.password_manager_enabled", "false");
		  
		       capabilities.setCapability("chrome.prefs", chromePreferences);
		
		    //   Util u = new executar.Util();
		Util.driver = new ChromeDriver(capabilities);
		
	      
		Util.driver.manage().window().maximize();
		Util.driver.navigate().to(URl);
		
	}

	public void acessarOmni(String user, String password) throws Exception {
				
		Util.driver.findElement(By.id(User)).sendKeys(user);
		Util.driver.findElement(By.id(Senha)).sendKeys(password);
		Util.driver.findElement(By.cssSelector(Entrar)).click();
		Thread.sleep(5000);
		
		
	}
	
	
	

}
