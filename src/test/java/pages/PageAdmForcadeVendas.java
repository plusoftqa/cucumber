package pages;

import executar.Util;
import locators.LocatorsAdmForcadeVendas;

public class PageAdmForcadeVendas extends LocatorsAdmForcadeVendas{
	Util u = new Util();

	public void digitar_Tempo_de_Notificacao_antes_do_vencimento(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(notificacao_tempo_de_notificacao_antes_do_vencimento_number).clear();
		u.Digitar(notificacao_tempo_de_notificacao_antes_do_vencimento_number, arg1);
		
	}

	public void selecionar_Periodo(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(notificacao_periodo_select, arg1);
	}

	public void checkbox_Notificar_o_proprietario_da_Oportunidade() {
		// TODO Auto-generated method stub
		u.checkbox(notificacao_notificar_proprietario_da_oportunidade_checkbox);
	}

	public void checkbox_Notificar_responsaveis_do_time() {
		// TODO Auto-generated method stub
		
		u.checkbox(notificacao_notificar_responsaveis_do_time_checkbox);

	}

	public void checkbox_Notificar_Notificar_email() {
		// TODO Auto-generated method stub
		u.checkbox(notificacao_notificar_por_email_checkbox);
	}

	public void digitar_Informar_todos_os_email_que_serao_notificados(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(notificacao_infor_tds_emails_type).clear();
		u.Digitar(notificacao_infor_tds_emails_type, arg1);
	}

	public void digitar_Tipo_de_negocio(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipo_de_negocio_type).clear();
		u.Digitar(tipo_de_negocio_type, arg1);
	}

	public void digitar_Pontuacao(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(forca_de_vendas_pontuacao_number).clear();
		u.Digitar(forca_de_vendas_pontuacao_number, arg1);
	}

	public void checkbox_Notificar_unidade_de_negocio() {
		// TODO Auto-generated method stub
		u.checkbox(tipo_de_negocio_notificar_unidade_de_negocio_checkbox);
	}

	public void checkbox_Notificar_proprietario_da_oportunidade() {
		// TODO Auto-generated method stub
		u.checkbox(tipo_de_negocio_notificar_proprietario_da_oportunidade_checkbox);
	}

	public void checkbox_Notificar_proprietario_da_conta() {
		// TODO Auto-generated method stub
		u.checkbox(tipo_de_negocio_notificar_proprietario_da_conta_checkbox);
	}

	public void checkbox_Notificar_responsaveis_do_times() {
		// TODO Auto-generated method stub
		u.checkbox(tipo_de_negocio_notificar_reponsaveis_do_time_checkbox);
	}

	public void digitar_Unidade_de_negocio(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(unidades_de_negocio_type).clear();
		u.Digitar(unidades_de_negocio_type, arg1);
	}

	public void digitar_Produto(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(produto_type).clear();
		u.Digitar(produto_type, arg1);
		
	}

	public void digitar_Preco(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(produto_preco_number).clear();
		u.Digitar(produto_preco_number, arg1);
	}

	public void checkbox_Recorrente() {
		// TODO Auto-generated method stub
		u.checkbox(produto_recorrente_checkbox);
	}

	public void digitar_Estagios_de_oportunidade(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(estagio_de_oportunidade_type).clear();
		u.Digitar(estagio_de_oportunidade_type, arg1);
	}

	public void digitar_Sequencia(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(estagio_de_negociacao_sequencia_number).clear();
		u.Digitar(estagio_de_negociacao_sequencia_number, arg1);
		
	}

	public void select_Tipo_de_negocio(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(estagio_de_negociacao_tipo_de_negocio_select, arg1);
	}

	public void select_Estagio_de_oportunidade(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(estagio_de_negociacao_estagio_de_oportunidade_select, arg1);
	}

	public void digitar_Percentual(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(estagio_de_negociacao_percentual_number).clear();
		u.Digitar(estagio_de_negociacao_percentual_number, arg1);
	}

	public void digitar_Prazo(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(estagio_de_negociacao_prazo_number).clear();
		u.Digitar(estagio_de_negociacao_prazo_number, arg1);
	}

	public void digitar_Status_SFA(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Status_forca_vendas_type).clear();
		u.Digitar(Status_forca_vendas_type, arg1);
	}

	public void digitar_Objecoes(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(objecao_type).clear();
		u.Digitar(objecao_type, arg1);
	}

	public void digitar_Tempo(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tempo_type).clear();
		u.Digitar(tempo_type, arg1);
	}

	public void digitar_Orcamento(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(orcamento_type).clear();
		u.Digitar(orcamento_type, arg1);
	}

	public void digitar_Origem_da_oportunidade(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(origem_da_oportunidade_type).clear();
		u.Digitar(origem_da_oportunidade_type, arg1);
	}

	public void digitar_Nivel_de_interesse(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(niveis_de_interesse_type).clear();
		u.Digitar(niveis_de_interesse_type, arg1);
	}

	public void digitar_Pontuacao_da_oportunidade(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(niveis_de_interesse_pontuacao_da_oportunidade_number).clear();
		u.Digitar(niveis_de_interesse_pontuacao_da_oportunidade_number, arg1);
	}

	public void digitar_Pontuacao_do_contato(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(niveis_de_interesse_pontuacao_do_contato_number).clear();
		u.Digitar(niveis_de_interesse_pontuacao_do_contato_number, arg1);
	}

	public void digitar_Sucesso_da_oportunidade(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(sucesso_da_oportunidade_type).clear();
		u.Digitar(sucesso_da_oportunidade_type, arg1);
	}

	public void digitar_Nivel_decisorio(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(nivel_decisorio_type).clear();
		u.Digitar(nivel_decisorio_type, arg1);
		
	}
	
	public void digitar_Necessidades(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(necessidades_type).clear();
		u.Digitar(necessidades_type, arg1);
		
	}
	
	public void digitar_Parceiros(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(parceiro_type).clear();
		u.Digitar(parceiro_type, arg1);
		
	}

	public void digitar_Autoridade(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(autoriedade_type).clear();
		u.Digitar(autoriedade_type, arg1);
	}

	public void digitar_Papel_de_parceiro(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(papeis_de_parceiros_type).clear();
		u.Digitar(papeis_de_parceiros_type, arg1);
	}

	public void digitar_Concorrente(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(concorrentes_type).clear();
		u.Digitar(concorrentes_type, arg1);
	}

	public void digitar_Tipo_de_despesa(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipo_de_despesa_type).clear();
		u.Digitar(tipo_de_despesa_type, arg1);
	}

	public void checkbox_Informar_quantidade() {
		// TODO Auto-generated method stub
		u.checkbox(tipo_de_despesa_informar_quantidade_checkbox);
	}

	public void digitar_Controle_de_metas(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(controle_de_metas_type).clear();
		u.Digitar(controle_de_metas_type, arg1);
	}

	public void digitar_Data_inicio(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(controle_de_metas_data_inicio_date).clear();
		u.Digitar(controle_de_metas_data_inicio_date, arg1);
	}

	public void digitar_Data_final(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(controle_de_metas_data_fim_date).clear();
		u.Digitar(controle_de_metas_data_fim_date, arg1);
	}

	public void digitar_Valor(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(controle_de_metas_valor_number).clear();
		u.Digitar(controle_de_metas_valor_number, arg1);
	}
	
	

	

}
