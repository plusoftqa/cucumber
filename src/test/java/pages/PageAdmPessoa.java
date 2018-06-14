package pages;

import org.openqa.selenium.JavascriptExecutor;

import executar.Util;
import locators.LocatorsAdmPessoa;

public class PageAdmPessoa extends LocatorsAdmPessoa {
	Util u = new Util();
	PageUtilAdm adm = new PageUtilAdm();
	public void digitar_Cargos(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(cargo_type).clear();
		u.Digitar(cargo_type, arg1);
		
	}
	public void digitar_Profissoes(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(profissao_type).clear();
		u.Digitar(profissao_type, arg1);
		
	}
	public void digitar_Estado_Civil(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(estado_civil_type).clear();
		u.Digitar(estado_civil_type, arg1);
	}
	public void digitar_Relacoes_entre_as_pessoas(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(relacoes_entre_as_pessoas_type).clear();
		u.Digitar(relacoes_entre_as_pessoas_type, arg1);
	}
	public void digitar_Formas_de_tratamento(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(formas_de_tratamento_type).clear();
		u.Digitar(formas_de_tratamento_type, arg1);
	}
	public void digitar_Segmentos_empresarial(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(segmentos_empresarial_type).clear();
		u.Digitar(segmentos_empresarial_type, arg1);
	}
	public void digitar_Tipos_de_publico(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipos_de_publico_type).clear();
		u.Digitar(tipos_de_publico_type, arg1);
		
	}
	public void checkbox_Visivel_em_pessoa() {
		// TODO Auto-generated method stub
		
			JavascriptExecutor js = (JavascriptExecutor) Util.driver;
	        js.executeScript("document.getElementById('"+tipos_de_publico_Visivel_em_pessoa_checkbox+"').click()");
			
			}
		
	
	public void checkbox_Visivel_em_contato() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) Util.driver;
        js.executeScript("document.getElementById('"+tipos_de_publico_Visivel_em_contato_checkbox+"').click()");
	}
	public void digitar_Pessoas_nao_identificadas(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(pessoa_nao_identificada_type).clear();
		u.Digitar(pessoa_nao_identificada_type, arg1);
	}
	public void digitar_Pessoa(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(pessoa_nao_identificada_pessoa_number).clear();
		u.Digitar(pessoa_nao_identificada_pessoa_number, arg1);
		
	}
	public void digitar_Tipos_de_origem(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipos_de_origem_type).clear();
		u.Digitar(tipos_de_origem_type, arg1);
	}
	public void digitar_Origens(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(origem_type).clear();
		u.Digitar(origem_type, arg1);
		
	}
	public void selecionar_Tipo_de_origem(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(origem_tipo_de_origem_select, arg1);
		
	}
	public void digitar_Status(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(status_type).clear();
		u.Digitar(status_type, arg1);
	}
	public void digitar_Classificacoes(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(classificacoes_type).clear();
		u.Digitar(classificacoes_type, arg1);
	}
	public void digitar_Portes(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(portes_type).clear();
		u.Digitar(portes_type, arg1);
	}
	
	

}
