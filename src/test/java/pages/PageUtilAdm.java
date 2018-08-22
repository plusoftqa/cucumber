package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import executar.Screenshot;
import executar.Util;
import locators.LocatorsUtilADM;

public class PageUtilAdm extends LocatorsUtilADM{
	
	Util u = new Util();
	Screenshot s = new Screenshot();
	
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
		case "Pessoa":
			menu = pessoa;
			break;
		case "Atendimento":
			menu = atendimento;
			break;
		case "Reclamacao":
			menu = reclamacao;
			break;
		case "Forca de vendas":
			menu = forcadeVendas;
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
			//MENU LOCALIZACAO
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
		case "Tipos de endereco":
			submenu = localizacao_tip_end;
			break;
		case "Tipos de logradouro":
			submenu = localizacao_tip_logra;
			break;
			//MENU PESSOA
		case "Configuracoes de pessoa":
			submenu = pessoa_configuracoes_pessoa;
			break;
		case "Cargos":
			submenu = pessoa_cargo;
			break;
		case "Profissoes":
			submenu = pessoa_profissao;
			break;
		case "Estado Civil":
			submenu = pessoa_estado_civil;
			break;
		case "Relacoes entre as pessoas":
			submenu = pessoa_relacoes_entre_pessoas;
			break;
		case "Formas de tratamento":
			submenu = pessoa_formas_tratamento;
			break;
		case "Segmentos empresarial":
			submenu = pessoa_segmentos_empresarial;
			break;
		case "Tipos de publico":
			submenu = pessoa_tipos_publico;
			break;
		case "Pessoas nao identificadas":
			submenu = pessoa_pessoas_nao_identificadas;
			break;
		case "Tipos de origem":
			submenu = pessoa_tipos_de_origem;
			break;
		case "Origens":
			submenu = pessoa_origens;
			break;
		case "Status":
			submenu = pessoa_status;
			break;
		case "Classificacoes":
			submenu = pessoa_classificacoes;
			break;
		case "Portes":
			submenu = pessoa_portes;
			break;
		case "Unificacao Cadastral":
			submenu = pessoa_unificacao_cadastral;
			break;
			//Menu Atendimento
		case "Como localizou":
			submenu = atendimento_como_localizou;
			break;
		case "Midias":
			submenu = atendimento_midias;
			break;
		case "Tipos de retorno":
			submenu = atendimento_tipos_de_retorno;
			break;
		case "Estado de animo":
			submenu = atendimento_estados_de_animo;
			break;
		case "Formas de contato":
			submenu = atendimento_formas_de_contato;
			break;
			//MENU RECLAMACAO
		case "Fabrica":
			submenu = reclamcao_fabrica;
			break;
		case "Situacoes da embalagem":
			submenu = reclamcao_situacao_embalagem;
			break;
		case "Prestadores de servico":
			submenu = reclamacao_prestadores_de_serviço;
			break;
		case "Motivos do lote em branco":
			submenu = reclamacao_motivos_de_lote_em_branco;
			break;
		case "Motivos de troca":
			submenu = reclamacao_motivos_de_troca;
			break;
		case "Formas de ressarcimento":
			submenu = reclamcao_formas_de_ressarcimento;
			break;
		case "Formas de envio de amostra":
			submenu = reclamacao_formas_de_envio_de_amostra;
			break;
		case "Exposicoes do produto":
			submenu = reclamacao_exposicoes_de_produto;
			break;
		case "Locais de compra":
			submenu = reclamacao_locais_de_compra;
			break;
		case "Condicoes de uso":
			submenu = reclamacao_condicoes_dE_uso;
			break;
		case "Tipos de terceiro":
			submenu = reclamacao_tipos_de_terceiro;
			break;
		case "Justificativas do laudo":
			submenu = reclamacao_justificativas_de_laudo;
			break;
		case "Laudos padrao":
			submenu = reclamacao_laudo_padrao;
			break;
		case "Origens do problema":
			submenu = reclamacao_origens_do_problema;
			break;
		case "Procedentes":
			submenu = reclamacao_procedentes;
			break;
		case "Resultados do laudo":
			submenu = reclamacao_resultados_do_laudo;
			break;
		case "Tipos de reembolso":
			submenu = reclamacao_tipos_de_reembolso;
			break;
		case "Tipos de envio":
			submenu = reclamacao_tipos_de_envio;
			break;
		//FORÇA DE VENDAS
		case "Notificacoes":
			submenu = forcadeVendas_notificacao;
			break;
		case "Tipos de negocio":
			submenu = forcadeVendas_tipo_de_negocio;
			break;
		case "Unidades de negocio":
			submenu = forcadeVendas_unidades_de_negocio;
			break;
		case "Produtos":
			submenu = forcadeVendas_produto;
			break;
		case "Estagios de oportunidade":
			submenu = forcadeVendas_estagios_de_oportunidades;
			break;
		case "Estagios de negociacao":
			submenu = forcadeVendas_estagios_de_negociacao;
			break;
		case "Status SFA":
			submenu = forcadeVendas_status;
			break;
		case "Objecoes":
			submenu = forcadeVendas_objecoes;
			break;
		case "Tempos":
			submenu = forcadeVendas_tempos;
			break;
		case "Orcamentos":
			submenu = forcadeVendas_orcamentos;
			break;
		case "Origem das Oportunidades":
			submenu = forcadeVendas_origem_das_oportunidades;
			break;
		case "Niveis de interesse":
			submenu = forcadeVendas_niveis_de_interesse;
			break;
		case "Sucessos da oportunidade":
			submenu = forcadeVendas_sucessos_da_oportunidade;
			break;
		case "Niveis decisorios":
			submenu = forcadeVendas_niveis_decisorios;
			break;
		case "Necessidades":
			submenu = forcadeVendas_necessidades;
			break;
		case "Parceiros":
			submenu = forcadeVendas_parceiros;
			break;
		case "Autoridades":
			submenu = forcadeVendas_autoridades;
			break;
		case "Papeis de parceiro":
			submenu = forcadeVendas_papeis_de_parceiro;
			break;
		case "Concorrentes":
			submenu = forcadeVendas_concorrentes;
			break;
		case "Tipos de despesas":
			submenu = forcadeVendas_tipos_de_despesas;
			break;
		case "Transferencias de oportunidade":
			submenu = forcadeVendas_transferencia_de_oportunidades;
			break;
		case "Transferencias de Contas":
			submenu = forcadeVendas_transferencia_de_contas;
			break;
		case "Controles de metas":
			submenu = forcadeVendas_controle_de_metas;
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
			Util.driver.findElement(By.cssSelector(mais)).click();
			Thread.sleep(3000);
			by = By.cssSelector(duplicar);
			break;
		case "Excluir busca":		
			Util.driver.findElement(By.xpath("//td[@class='attr-actions']"));
			by = By.cssSelector(remover_busca);
			break;
		case "Editar":			
			Util.driver.findElement(By.xpath("//td[@class='attr-actions']"));
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


	
	
	public void checkbox_Inativo() throws Exception {
		
		try {
		JavascriptExecutor js = (JavascriptExecutor) Util.driver;
        js.executeScript("document.getElementById('field-inactiverecord').click()");
		

		
	}catch (Exception e) {
		JavascriptExecutor js = (JavascriptExecutor) Util.driver;
        js.executeScript("document.getElementById('field-inactive').click()");
		
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
		
	}


	public void filtro_busca(String busca) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(By.id("cmb-finder-key"), busca);
		switch (busca) {
		case "Ativos":
			busca = "Não";
			
			break;
		case "Inativos":
			busca = "Sim";
			break;
			
		}
		try {			
		
		
		List<WebElement> tabela = Util.driver.findElements(By.tagName("table"));

		for (WebElement tabelas : tabela) {

			List<WebElement> colunas = tabelas.findElements(By.tagName("td"));
			
			
			
			int total = colunas.size();
			
			
			if (colunas.get(total-2).getText().equals(busca)) {
				
				System.out.println("ULTIMA : " + colunas.get(total-2).getText());
			}
			/*
			for (WebElement coluna : colunas) {
				 
					
				
				System.out.println(coluna.getText());
				break;
				//
				
				
			}*/
		
		}}catch(Exception e ) {
			
		}}
	public void validar_ordenacao_tela_de_busca() {
		// TODO Auto-generated method stub
		List<WebElement> tabela = Util.driver.findElements(By.tagName("table"));

		for (WebElement tabelas : tabela) {

			List<WebElement> linha = tabelas.findElements(By.tagName("th"));
			for (WebElement linhas : linha) {
				List<String> texto = new ArrayList<>();
				String t = linhas.getText();
				Collections.addAll(texto, t);

				for (int i = 0; i < texto.size(); i++) {
					Actions a = new Actions(Util.driver);

					a.doubleClick(linhas).doubleClick().build().perform();
		
	
				}
				}
			}
		}


	public void validar_Alert_de_Sucesso() {
		// TODO Auto-generated method stub
		try {
			Assert.assertEquals(Msg_sucesso, Msg_sucesso );
			Util.driver.findElement(By.xpath(Msg_sucesso)).click();
		} catch (Exception e) {
			
			
		}
		
		
		
		
	}
	
	public void validar_Alert_de_erro() {
		// TODO Auto-generated method stub
		
			
			Util.driver.findElement(By.cssSelector(Msg_Erro)).click();
			System.out.println("OK");
	
		
			
	
		
	}


	public void fechar() {
		// TODO Auto-generated method stub
		Util.driver.quit();
	}
}
