package locators;

import org.openqa.selenium.By;

public class LocatorsAdmCalendario {
	//Feriados
	protected By data_feriado_date = By.name("holidayDate");
	protected By descricao_feriado_type = By.name("holidayName");
	
	//Grade de horariso
	protected By descricao_grade_de_horarios_type = By.name("input-time_timetable-ds_timetable");
	protected By inclusao_horarios_Dias_grade_de_horarios_select = By.name("f1991-t107195225585723");
	protected By inclusao_horarios_Hr_Inicial_grade_de_horarios_type = By.name("f1992-t107226097283266");
	protected By inclusao_horarios_Hr_Final_grade_de_horarios_type = By.name("f1993-t107227496026538");
	protected By botao_novo_grade_de_horario = By.cssSelector("button[id='btn-add-weekday']");
	
	

}
