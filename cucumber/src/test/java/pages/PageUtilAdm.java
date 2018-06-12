package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import executar.Util;
import locators.LocatorsUtilADM;

public class PageUtilAdm extends LocatorsUtilADM{
	
	Util u = new Util();
	
	public void acessarmodulo(String Modulo) throws Exception {
		
		Util.driver.findElement(By.cssSelector(Menu)).click();
		Thread.sleep(3000);
		switch (Modulo) {
		case "Administrativo":
			Modulo = ModuloADM;
			break;
		case "Call Center":
			Modulo = ModuloCallCenter;
			break;
		}
		
		Util.driver.findElement(By.cssSelector(Modulo)).click();
		Thread.sleep(3000);
		
		
	}
	

	public void acessar_menu(String menu) throws Exception {
		Util.driver.switchTo().defaultContent();
		
		switch (menu) {
		case "Calendario":
			menu = calendarioAdm;
			
			break;
		case "Usuario":
			menu = usuario;
			break;
		case "Localizacao":
			menu = localizacao;
			break;

		}
		
		Util.Selecionar_Menu_e_Sub_menu_ADM(menu);
		Thread.sleep(3000);
		
		
	}

	public void acessar_sub_menu(String submenu) throws Exception {
		// TODO Auto-generated method stub
		switch (submenu) {
		//Menu Calendarios
		case "Grade de horarios":
			submenu = calendario_grade_de_horarios;
			
			break;
		case "Feriados":
			submenu = calendario_feriados;
			break;
			//Menu Usuarios
		case "Grupos de usuario":
			submenu = usuario_grupo_de_usuario;
			break;
		case "Times":
			submenu = usuario_times;
			break;
		case "Departamentos":
			submenu = usuario_departamentos;
			break;
		case "Usuarios":
			submenu = usuario_usuarios;
			break;
		case "Provedores de acesso":
			submenu = usuario_provedores_de_acesso;
			break;
		case "Seguranca":
			submenu = usuario_seguranca;
			break;
		case "Paises":
			submenu = localizacao_pais;
			break;
		case "Regioes":
			submenu = localizacao_regioes;
			break;
		case "Estados":
			submenu = localizacao_estados;
			break;
		case "Cidades":
			submenu = localizacao_cidades;
			break;
		case "Tipo de endereco":
			submenu = localizacao_tip_end;
			break;
		case "Tipo de logradouro":
			submenu = localizacao_tip_logra;
			break;

		}
		
		Util.Selecionar_Menu_e_Sub_menu_ADM(submenu);
		Thread.sleep(3000);
		Util.driver.switchTo().frame("frame_middle");
		Thread.sleep(3000);
	}

	public void clicar_botao(String botao) throws Exception {
		By by = null;
		switch (botao) {
		case "Novov1":
			by = By.cssSelector(novov1);			
			break;
		case "Salvarv1":
			by = By.xpath(salvarv1);
			break;
		case "Salvar e Novov1":
			by = By.cssSelector(salvar_e_novov1);
			break;
		case "Duplicarv1":
			by = By.xpath(duplicarv1);
			break;
		case "Excluirv1":
			by = By.xpath(removerv1);
			break;
		case "Excluir_buscarv1":
			by = By.xpath(removerv1_1);
			break;
		case "Cancelarv1":
			by = By.cssSelector(cancelarv1);
			break;
		case "Editarv1":
			by = By.xpath(editarv1);
			break;
		case "confirmar":
			by = By.xpath(confirmarv1);
			break;
		case "Associar Modulo":
			by = By.cssSelector(associarModuloGrupodeUsuarios);
			break;
		case "Associar Usuario":
			by = By.cssSelector(associarUsuarioGrupodeusuario);
			break;
		case "Remover Modulo":
			by = By.xpath(removerModuloGrupodeusuarios);
			break;
		case "Remover Usuario":
			by = By.xpath(removerUsuarioGrupodeusuarios);
			break;
		case "Permissao":
			by = By.xpath(permissao);
			break;
		case "Buscarv1":
			by = By.cssSelector(buscarv1botao);
			break;
		case "Salvar v1 Modal":
			by = By.xpath(salvarv1modal);
			break;
		case "Novo":
			by = By.cssSelector(novo);
			break;
		case "Salvar":
			by = By.cssSelector(salvar);
			break;
		case "Salvar e Novo":			
			Util.driver.findElement(By.cssSelector(mais)).click();
			Thread.sleep(3000);
			by = By.cssSelector(salvarenovo);
			break;
		case "Cancelar":			
			by = By.cssSelector(cancelar);
			break;
		case "Remover":			
			by = By.cssSelector(remover);
			break;
		case "Duplicar":			
			u.driver.findElement(By.cssSelector(mais)).click();
			Thread.sleep(3000);
			by = By.cssSelector(duplicar);
			break;
		case "Excluir busca":		
			u.driver.findElement(By.xpath("//td[@class='attr-actions']"));
			by = By.cssSelector(remover_busca);
			break;
		case "Editar":			
			u.driver.findElement(By.xpath("//td[@class='attr-actions']"));
			by = By.cssSelector(editar);
			break;
		}
		
	
		
		Util.Clicar(by);
		Thread.sleep(5000);
		
		

	}
	public void tooltips(String tooltips) {
		
		By by = null;
		switch (tooltips) {
		case "Imprimirv1":
			by = By.cssSelector(printv1);			
			break;
		case "CSVv1":
			by = By.cssSelector(csvv1);
			break;
		case "PDFv1":
			by = By.cssSelector(pdfv1);
			break;
		case "Copiarv1":
			by = By.cssSelector(copiarv1);
			break;

		}
		
		try {
		if (Util.driver.findElement(by).isDisplayed()) {
			
		}else {
			
		}
		// TODO Auto-generated method stub
		
	}catch(Exception e ) {
		
	}}


	public void acessar_modulo(String modulo) throws Exception {
		// TODO Auto-generated method stub
		
		switch (modulo) {
		case "Administrativo":
			modulo = ModuloADM;
			
			break;
		case "Usuario":
			modulo = ModuloCallCenter;
			break;

		}
		try {
			
		
		Util.Selecionar_Menu_e_Sub_menu_ADM(modulo);
		Thread.sleep(3000);
		
		}catch(Exception e ) {
		
	}}


	
	@SuppressWarnings("unused")
	public void checkbox_Inativo() throws Exception {
		if(true) {
		JavascriptExecutor js = (JavascriptExecutor) Util.driver;
        js.executeScript("document.getElementById('field-inactiverecord').click()");
		
		} else  {
			System.out.println("teste");
		}

		
	}


	public void validar_Caminho_do_Menu(String caminho) throws Exception {
		
		try {
		List<WebElement> menu = Util.driver.findElements(By.tagName("div"));

		for (WebElement menus : menu) {
			if (menus.getAttribute("class").contains("well no-select")) {
				System.out.println(menus.getText());
				 menus.getText().contains(caminho);
				if (menus.getText().contains(caminho)) {
					System.out.println(menus.getText().contains(caminho));
					
		
	}else {
		System.out.println(menus.getText());
	}
	
	
	

			}	}}catch(Exception e ) {
				
				
				
			}}


	public void validar_title(String title) throws Exception {
		
		
		try {
		if (Util.driver.getPageSource().contains("<h1>")) {
			WebElement t = Util.driver.findElement(By.tagName("h1"));
			if (t.getText().contains(title)) {
				System.out.println(t.getText());
				Thread.sleep(5000);
				Util.driver.switchTo().defaultContent();
				Util.driver.switchTo().frame("frame_middle");
			} else {
				Thread.sleep(5000);
				System.out.println(t.getText() + "NOK");
				Util.driver.switchTo().defaultContent();
				Util.driver.switchTo().frame("frame_middle");
			}
				
			}
			
		
		
	}catch (Exception e) {
		
		
		
	}
		
	
	}


	public void digitar_no_campo_de_busca(String busca) throws Exception {
		Thread.sleep(5000);
		Util.driver.findElement(buscarv1).clear();
		u.Digitar(buscarv1, busca);
		Thread.sleep(9000);		
		
	}


	public void digitar_no_campo_de_busca_v1(String busca) throws Exception {
		Thread.sleep(5000);
		Util.driver.findElement(buscarv1todos).clear();
		u.Digitar(buscarv1todos, busca);
		clicar_botao("Buscarv1");
		Util.driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Util.driver.switchTo().frame("frame_middle");
		
		
		Thread.sleep(9000);
		
	}


	public void digitar_busca(String busca) throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		Util.driver.findElement(buscarv2).clear();
		u.Digitar(buscarv2, busca);
		//clicar_botao("Buscarv1");
		Util.driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Util.driver.switchTo().frame("frame_middle");
	}}
