package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import executar.Util;
import locators.LocatorsAdmPessoa;


public class PageAdmPessoa extends LocatorsAdmPessoa {
Util u = new Util();





	public void acessarSubmenu(String menus) throws Exception {
		
		
		
		switch (menus) {
		case "Cargo":
			menus = SubmenuCargo;
			
			break;
		case "name":
			menus = "li[data-menu-id='menu.admin.person']";
			break;

		}
		
		
		
		u.Selecionar_Menu_e_Sub_menu_ADM(menus);
		
		Util.driver.switchTo().frame("frame_middle");
		Thread.sleep(3000);
	
		
		
	
	}

	public void criarUmCargo(String value) throws Exception {
		Thread.sleep(3000);
		Util.driver.findElement(By.cssSelector("button[aria-label='new']")).click();
		Thread.sleep(3000);
		u.Digitar(DigitarCargo, value);
		u.botaoSalvarMenuAdm();
		
		
		
	}

	public void validarAlertdesucesso() {
		
		WebDriverWait wait = new WebDriverWait(Util.driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("div"))).getAttribute("class").contains("ui-notification ng-scope success clickable");
	}

}
