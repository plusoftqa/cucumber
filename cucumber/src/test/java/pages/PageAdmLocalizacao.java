package pages;

import cucumber.api.java.en.And;
import executar.Util;
import locators.LocatoresAdmLocalizacao;


public class PageAdmLocalizacao extends LocatoresAdmLocalizacao{
	Util u = new Util();
	public void digitar_Paises(String paises) {
		// TODO Auto-generated method stub
		u.driver.findElement(paises_pais_type).clear();
		u.Digitar(paises_pais_type, paises);
	}

	public void digitar_Abreviacao(String arg1) {
		// TODO Auto-generated method stub
		u.driver.findElement(paises_abreviacao_type).clear();
		u.Digitar(paises_abreviacao_type, arg1);
	}

	public void digitar_Codigo_do_Pais(String arg1) {
		// TODO Auto-generated method stub
		u.driver.findElement(paises_cod_pais_type).clear();
		u.Digitar(paises_cod_pais_type, arg1);
		
	}

	public void digitar_Regioes(String arg1) {
		// TODO Auto-generated method stub
		u.driver.findElement(regioes_type).clear();
		u.Digitar(regioes_type, arg1);
		
	}

	public void selecionar_Pais(String arg1) {
		// TODO Auto-generated method stub
		//u.driver.findElement(Estados_pais_select).clear();
		u.selectMenuAdm(Estados_pais_select, arg1);
		
	}

	public void selecionar_Regiao(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(Estados_regiao_select, arg1);
		
	}

	public void digitar_Estados(String arg1) {
		// TODO Auto-generated method stub
		u.driver.findElement(Estados_estado_type).clear();
		u.Digitar(Estados_estado_type, arg1);
	}
	

	
	
}
