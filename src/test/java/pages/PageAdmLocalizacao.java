package pages;

import executar.Screenshot;
import executar.Util;
import locators.LocatoresAdmLocalizacao;


public class PageAdmLocalizacao extends LocatoresAdmLocalizacao{
	Util u = new Util();
	Screenshot s = new Screenshot();
	public void digitar_Paises(String paises) {
		// TODO Auto-generated method stub
		Util.driver.findElement(paises_pais_type).clear();
		u.Digitar(paises_pais_type, paises);
		Screenshot.logPrint("digitar_Paises");
		
	}

	public void digitar_Abreviacao(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(paises_abreviacao_type).clear();
		u.Digitar(paises_abreviacao_type, arg1);
		Screenshot.logPrint("digitar_Abreviacao");
	}

	public void digitar_Codigo_do_Pais(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(paises_cod_pais_type).clear();
		u.Digitar(paises_cod_pais_type, arg1);
		Screenshot.logPrint("digitar_Codigo_do_Pais");
		
	}

	public void digitar_Regioes(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(regioes_type).clear();
		u.Digitar(regioes_type, arg1);
		Screenshot.logPrint("digitar_Regioes");
		
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
		Util.driver.findElement(Estados_estado_type).clear();
		u.Digitar(Estados_estado_type, arg1);
	}

	public void selecionar_Estado(String arg1) {
		u.selectMenuAdm(Cidade_estado_select, arg1);
				
	}

	public void digitar_Codigo_da_cidade(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Cidade_Codigo_da_cidade_type).clear();
		u.Digitar(Cidade_Codigo_da_cidade_type, arg1);
	}

	public void digitar_Cidades(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Cidade_cidades_type).clear();
		u.Digitar(Cidade_cidades_type, arg1);
	}

	public void digitar_Tipos_de_endereco(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Tipos_de_endereco_type).clear();
		u.Digitar(Tipos_de_endereco_type, arg1);
		
	}

	public void digitar_Tipos_de_logradouro(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Tipos_de_logradouro_type).clear();
		u.Digitar(Tipos_de_logradouro_type, arg1);
	}
	

	
	
}
