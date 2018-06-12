package steps_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import executar.Util;
import pages.PageAdmCalendario;

public class StepAdmCalendario  {
	
	Util u = new Util();
	PageAdmCalendario calendario = new PageAdmCalendario();
	
	@And("^Incluir feriados\"([^\"]*)\"$")
	public void incluir_Calendario_Feriado(String feriado) throws Throwable {	
		calendario.incluir_feriado(feriado);
		Util.driver.switchTo().defaultContent();
		Util.driver.switchTo().frame("frame_middle");
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Given("^Digitar data feriado \"([^\"]*)\"$")
	public void digitar_feriado(String data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calendario.digitar_data_feriado(data);
	    
	}
	
	@And("^Digitar descricao feriado \"([^\"]*)\"$")
	public void digitar_descricao_feriado(String feriado) throws Throwable {
		calendario.digitar_descricao_feriado(feriado);
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	
	@Given("^checkbox recorrente feriado")
	public void checkbox_recorrente_feriado() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		calendario.checkbox_recorrente_feriado();
	 
	}
	
	@And("^Incluir Grade de horarios\"([^\"]*)\"$")
	public void incluir_Grade_de_horarios(String descricao) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calendario.incluir_Grade_de_horarios(descricao);
	    
	}




	@Given("^Digitar descricao grade de horarios \"([^\"]*)\"$")
	public void digitar_descricao_grade_de_horarios(String descricao) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calendario.digitar_descricao_grade_de_horarios(descricao);
	
	}

	@And("^Selecionar inclusao de horarios\\(Semana/Hora inicial/Hora Final\\) \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void selecionar_inclusao_de_horarios_Semana_Hora_inicial_Hora_Final(String semana, String hora_inicial, String hora_final) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    calendario.selecionar_inclusao_de_horarios_Semana_Hora_inicial_Hora_Final(semana, hora_inicial, hora_final);
	}

}
