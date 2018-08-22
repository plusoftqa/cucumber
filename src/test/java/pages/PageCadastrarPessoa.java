package pages;

import org.openqa.selenium.By;

import executar.Util;
import locators.LocatorsCadastrarPessoa;

public class PageCadastrarPessoa extends LocatorsCadastrarPessoa {
	Util u = new Util();

	public void botaoNovoAtendimento() throws Exception {
		Thread.sleep(3000);
		Util.driver.switchTo().frame("frame_middle");
		Util.Clicar(BotaoNovoAtendimento);
		
	}

	public void incluirNovaPessoa() throws Exception {
		Thread.sleep(3000);
		Util.driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Util.driver.switchTo().frame("f_rt_0");
		Thread.sleep(3000);
		Util.Clicar(IdentificarPessoa);
		Thread.sleep(3000);
		Util.driver.findElement(By.xpath(".//*[@action='/forms/plusoftcrm.person.forms.crm_person.identification/']")).isDisplayed();
		Util.Clicar(Novo);
		
		
	}

	public void preencherCamposObrigatorios() throws Exception {
		Thread.sleep(3000);
		Util.driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Util.driver.switchTo().frame("f_rt_0");
		Thread.sleep(3000);
		Util.driver.switchTo().frame("iframe_tab_0");
		Thread.sleep(3000);
	u.Digitar(nome_Razao_type, "TEste Automatizado");
		
	}

	public void salvar() {
		Util.Clicar(By.cssSelector("button[role='save']"));
		String Codigo = Util.driver.findElement(By.id("txt-person-id")).getText();
		System.out.println(Codigo);
		// TODO Auto-generated method stub
		
	}

	public void msgSucesso() {
		
		
		
	}
	

}
