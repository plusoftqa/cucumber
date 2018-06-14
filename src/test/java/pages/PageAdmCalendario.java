package pages;

import org.openqa.selenium.JavascriptExecutor;

import executar.Util;
import locators.LocatorsAdmCalendario;


public class PageAdmCalendario extends LocatorsAdmCalendario{
	Util u = new Util();
	
	public void incluir_feriado(String feriado) throws Exception {
		try {
		Thread.sleep(5000);
		Util.driver.findElement(data_feriado_date).sendKeys("01/01/2018");
		//u.Digitar(data_feriado_date, "01/01/2018");
		u.Digitar(descricao_feriado_type, feriado);
		// TODO Auto-generated method stub
		
		
		}catch(Exception e ) {
			
		}}

	public void digitar_data_feriado(String feriado) {
		u.Digitar(data_feriado_date, feriado);
		// TODO Auto-generated method stub
		
	}

	public void digitar_descricao_feriado(String feriado) {
		Util.driver.findElement(descricao_feriado_type).clear();
		u.Digitar(descricao_feriado_type, feriado);
		// TODO Auto-generated method stub
		
	}

	public void checkbox_recorrente_feriado() {
		
		JavascriptExecutor js = (JavascriptExecutor) Util.driver;
        js.executeScript("document.getElementById('input-time_holiday-do_fixed').click()");
		
		// TODO Auto-generated method stub
		
	}

	public void incluir_Grade_de_horarios(String descricao) {
		Util.driver.findElement(descricao_grade_de_horarios_type).clear();
		u.Digitar(descricao_grade_de_horarios_type, descricao);
		u.selectMenuAdm(inclusao_horarios_Dias_grade_de_horarios_select, "Domingo");
		u.Digitar(inclusao_horarios_Hr_Inicial_grade_de_horarios_type, "08:00");
		u.Digitar(inclusao_horarios_Hr_Final_grade_de_horarios_type, "18:00");		
		Util.Clicar(botao_novo_grade_de_horario);
		
	}

	public void digitar_descricao_grade_de_horarios(String descricao) {
		
		Util.driver.findElement(descricao_grade_de_horarios_type).clear();
		u.Digitar(descricao_grade_de_horarios_type, descricao);
		
	}

	public void selecionar_inclusao_de_horarios_Semana_Hora_inicial_Hora_Final(String semana, String hora_inicial,
			String hora_final) {
		u.selectMenuAdm(inclusao_horarios_Dias_grade_de_horarios_select, semana);
		u.Digitar(inclusao_horarios_Hr_Inicial_grade_de_horarios_type, hora_inicial);
		u.Digitar(inclusao_horarios_Hr_Final_grade_de_horarios_type, hora_final);
		Util.Clicar(botao_novo_grade_de_horario);
		
	}
	
	
	

}
