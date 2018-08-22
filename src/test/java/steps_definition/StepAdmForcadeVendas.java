package steps_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import executar.Util;
import pages.PageAdmForcadeVendas;
import pages.PageAdmReclamacao;

public class StepAdmForcadeVendas {
	Util u = new Util();
	PageAdmForcadeVendas forcadeVendas = new PageAdmForcadeVendas();
	

	@And("^Digitar Tempo de Notificacao antes do vencimento \"([^\"]*)\"$")
	public void digitar_Tempo_de_Notificacao_antes_do_vencimento(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    forcadeVendas.digitar_Tempo_de_Notificacao_antes_do_vencimento(arg1);
	}

	@And("^Selecionar Periodo \"([^\"]*)\"$")
	public void selecionar_Periodo(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.selecionar_Periodo(arg1);
	}

	@And("^Checkbox Notificar o proprietario da Oportunidade$")
	public void checkbox_Notificar_o_proprietario_da_Oportunidade() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_o_proprietario_da_Oportunidade();
	}

	@And("^Checkbox Notificar Responsaveis do time$")
	public void checkbox_Notificar_responsaveis_do_time() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_responsaveis_do_time();
	}

	@And("^Checkbox Notificar Notificar email$")
	public void checkbox_Notificar_Notificar_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_Notificar_email();
	}

	@And("^Digitar Informar todos os email que serao notificados \"([^\"]*)\"$")
	public void digitar_Informar_todos_os_email_que_serao_notificados(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Informar_todos_os_email_que_serao_notificados(arg1);
	}
	


	@Given("^Digitar Tipo de negocio \"([^\"]*)\"$")
	public void digitar_Tipo_de_negocio(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Tipo_de_negocio(arg1);
	}

	@Given("^Digitar Pontuacao \"([^\"]*)\"$")
	public void digitar_Pontuacao(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Pontuacao(arg1);
	}

	@Given("^Checkbox Notificar unidade de negocio$")
	public void checkbox_Notificar_unidade_de_negocio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_unidade_de_negocio();
	}

	@Given("^Checkbox Notificar proprietario da oportunidade$")
	public void checkbox_Notificar_proprietario_da_oportunidade() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_proprietario_da_oportunidade();
	}

	@Given("^Checkbox Notificar proprietario da conta$")
	public void checkbox_Notificar_proprietario_da_conta() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_proprietario_da_conta();
	}

	@Given("^Checkbox Notificar responsaveis do times$")
	public void checkbox_Notificar_responsaveis_do_times() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Notificar_responsaveis_do_times();
	}
	
	@Given("^Digitar Unidade de negocio \"([^\"]*)\"$")
	public void digitar_Unidade_de_negocio(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Unidade_de_negocio(arg1);
	}
	
	@Given("^Digitar Produto \"([^\"]*)\"$")
	public void digitar_Produto(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Produto(arg1);
	}

	@Given("^Digitar Preco \"([^\"]*)\"$")
	public void digitar_Preco(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Preco(arg1);
	}
	
	@Given("^Checkbox Recorrente$")
	public void checkbox_Recorrente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Recorrente();

}
	
	@Given("^Digitar Estagios de oportunidade \"([^\"]*)\"$")
	public void digitar_Estagios_de_oportunidade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Estagios_de_oportunidade(arg1);
	}
	
	@Given("^Digitar Sequencia \"([^\"]*)\"$")
	public void digitar_Sequencia(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Sequencia(arg1);
	}

	@Given("^Select Tipo de negocio \"([^\"]*)\"$")
	public void select_Tipo_de_negocio(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.select_Tipo_de_negocio(arg1);
	}

	@Given("^Select Estagio de oportunidade \"([^\"]*)\"$")
	public void select_Estagio_de_oportunidade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.select_Estagio_de_oportunidade(arg1);
	}

	@Given("^Digitar Percentual \"([^\"]*)\"$")
	public void digitar_Percentual(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Percentual(arg1);
	}

	@Given("^Digitar Prazo \"([^\"]*)\"$")
	public void digitar_Prazo(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Prazo(arg1);
	}
	
	@Given("^Digitar Status SFA \"([^\"]*)\"$")
	public void digitar_Status_SFA(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Status_SFA(arg1);
	}
	
	@Given("^Digitar Objecoes \"([^\"]*)\"$")
	public void digitar_Objecoes(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Objecoes(arg1);
	}
	
	@Given("^Digitar Tempo \"([^\"]*)\"$")
	public void digitar_Tempo(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Tempo(arg1);
	}
	
	@Given("^Digitar Orcamento \"([^\"]*)\"$")
	public void digitar_Orcamento(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Orcamento(arg1);
	}
	
	@Given("^Digitar Origem da oportunidade \"([^\"]*)\"$")
	public void digitar_Origem_da_oportunidade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Origem_da_oportunidade(arg1);
	}
	
	@Given("^Digitar Nivel de interesse \"([^\"]*)\"$")
	public void digitar_Nivel_de_interesse(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Nivel_de_interesse(arg1);
	}

	@Given("^Digitar Pontuacao da oportunidade \"([^\"]*)\"$")
	public void digitar_Pontuacao_da_oportunidade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Pontuacao_da_oportunidade(arg1);
	}

	@Given("^Digitar Pontuacao do contato \"([^\"]*)\"$")
	public void digitar_Pontuacao_do_contato(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Pontuacao_do_contato(arg1);
	}
	
	@Given("^Digitar Sucesso da oportunidade \"([^\"]*)\"$")
	public void digitar_Sucesso_da_oportunidade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Sucesso_da_oportunidade(arg1);
	}
	
	@Given("^Digitar Nivel decisorio \"([^\"]*)\"$")
	public void digitar_Nivel_decisorio(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Nivel_decisorio(arg1);
	}
	
	@Given("^Digitar Necessidade \"([^\"]*)\"$")
	public void digitar_Necessidades(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Necessidades(arg1);
	}
	
	@Given("^Digitar Parceiros \"([^\"]*)\"$")
	public void digitar_Parceiros(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Parceiros(arg1);
	}
	
	@Given("^Digitar Autoridade \"([^\"]*)\"$")
	public void digitar_Autoridade(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Autoridade(arg1);
	}
	
	@Given("^Digitar Papel de parceiro \"([^\"]*)\"$")
	public void digitar_Papel_de_parceiro(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Papel_de_parceiro(arg1);
	}

	@Given("^Digitar Concorrente \"([^\"]*)\"$")
	public void digitar_Concorrente(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Concorrente(arg1);
	}
	
	@Given("^Digitar Tipo de despesa \"([^\"]*)\"$")
	public void digitar_Tipo_de_despesa(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Tipo_de_despesa(arg1);
	}
	
	@And("^Checkbox Informar quantidade$")
	public void checkbox_Informar_quantidade() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.checkbox_Informar_quantidade();
	}
	
	@Given("^Digitar Controle de metas \"([^\"]*)\"$")
	public void digitar_Controle_de_metas(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Controle_de_metas(arg1);
	}

	@Given("^Digitar Data inicio \"([^\"]*)\"$")
	public void digitar_Data_inicio(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Data_inicio(arg1);
	}

	@Given("^Digitar Data final \"([^\"]*)\"$")
	public void digitar_Data_final(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Data_final(arg1);
	}

	@Given("^Digitar Valor \"([^\"]*)\"$")
	public void digitar_Valor(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		forcadeVendas.digitar_Valor(arg1);
	}
	
	
	
}