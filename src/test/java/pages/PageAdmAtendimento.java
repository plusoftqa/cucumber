package pages;

import executar.Util;
import locators.LocatoresAdmAtendimento;


public class PageAdmAtendimento extends LocatoresAdmAtendimento{
	Util u = new Util();

	public void digitar_Como_localizou(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(como_localizou_type).clear();
		u.Digitar(como_localizou_type, arg1);
		
	}

	public void digitar_Midia(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(midias_type).clear();
		u.Digitar(midias_type, arg1);
		
	}

	public void select_Como_localizou(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(midias_comoLocalizou_select, arg1);
	}

	public void digitar_Tipo_de_retorno(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipoderetorno_type).clear();
		u.Digitar(tipoderetorno_type, arg1);
		
	}

	public void select_Forma_de_retorno(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(tipoderetorno_formadeRetorno_select, arg1);
	}

	public void digitar_Estado_de_animo(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(estadodeanimo_type).clear();
		u.Digitar(estadodeanimo_type, arg1);
		
	}

	public void digitar_Formas_de_contato(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(formasdecontato_type).clear();
		u.Digitar(formasdecontato_type, arg1);
	} 
	
	
	
	
	
	

}
