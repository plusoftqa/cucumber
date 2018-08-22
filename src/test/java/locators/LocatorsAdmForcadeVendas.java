package locators;

import org.openqa.selenium.By;

public class LocatorsAdmForcadeVendas {
	
	protected By forca_de_vendas_pontuacao_number = By.id("field-score");
	
	//Notificações
	protected By notificacao_tempo_de_notificacao_antes_do_vencimento_number = By.id("field-notificationtime");
	protected By notificacao_periodo_select = By.id("field-donotificationtime");
	protected String notificacao_notificar_proprietario_da_oportunidade_checkbox = "field-ownernotification";
	protected String notificacao_notificar_responsaveis_do_time_checkbox = "field-teamnotification";
	protected String notificacao_notificar_por_email_checkbox = "field-emailnotificaiton";
	protected By notificacao_infor_tds_emails_type = By.id("field-inputemailnotificationtext");
	//Tipos de negocio
	protected By tipo_de_negocio_type = By.id("field-opportunitybusinessname");	
	protected String tipo_de_negocio_notificar_unidade_de_negocio_checkbox = "field-notifybusinessunit";
	protected String tipo_de_negocio_notificar_proprietario_da_oportunidade_checkbox = "field-notifyopportunityowner" ;
	protected String tipo_de_negocio_notificar_proprietario_da_conta_checkbox = "field-notifyaccountowner";
	protected String tipo_de_negocio_notificar_reponsaveis_do_time_checkbox = "field-notifyteamowner";
	//Unidades de negocio
	protected By unidades_de_negocio_type = By.id("field-businessunitname");
	//Produtos
	protected By produto_type = By.id("field-opportunityproductname");
	protected By produto_preco_number = By.id("field-price");
	protected String produto_recorrente_checkbox = "field-recurrent";
	//Estagio de oportunidade
	protected By estagio_de_oportunidade_type = By.id("field-opportunitystagename");
	//Estagios de negociacao
	protected By estagio_de_negociacao_sequencia_number = By.id("field-sequence");
	protected By estagio_de_negociacao_tipo_de_negocio_select = By.id("field-opportunitybusinessid");
	protected By estagio_de_negociacao_estagio_de_oportunidade_select = By.id("field-opportunitystageid");
	protected By estagio_de_negociacao_percentual_number = By.id("field-percent");
	protected By estagio_de_negociacao_prazo_number = By.id("field-timeframe");
	//Status
	protected By Status_forca_vendas_type = By.id("field-opportunitystatusname");
	//Objecoes
	protected By objecao_type = By.id("field-opportunityobjectionname");
	//tempo
	protected By tempo_type = By.id("field-opportunityforecastname");
	//orcamento
	protected By orcamento_type = By.id("field-opportunitybudgetname");
	//Origem da oportunidade
	protected By origem_da_oportunidade_type = By.id("field-opportunityoriginname");
	//Niveis de interesse
	protected By niveis_de_interesse_type = By.id("field-opportunityinterestname");
	protected By niveis_de_interesse_pontuacao_da_oportunidade_number = By.id("field-scoreopportunity");
	protected By niveis_de_interesse_pontuacao_do_contato_number = By.id("field-scorecontact");
	//Sucessos da Oportunidade
	protected By sucesso_da_oportunidade_type = By.id("field-opportunitysuccessreason");
	//Niveis decisorios
	protected By nivel_decisorio_type = By.id("field-contactrolename");
	//necessidades
	protected By necessidades_type = By.id("field-opportunityneededname");
	//parceiros
	protected By parceiro_type = By.id("field-partnername");
	//autoriedade
	protected By autoriedade_type = By.id("field-opportunityauthorityname");
	//papeis parceiros
	protected By papeis_de_parceiros_type = By.id("field-ds_partnerrole");
	//papeis concorrente
	protected By concorrentes_type = By.id("field-competitorname");
	//Tipo de despesa
	protected By tipo_de_despesa_type = By.id("field-eventcosttypename");
	protected String tipo_de_despesa_informar_quantidade_checkbox = "field-quantity";
	//Controle de metas
	protected By controle_de_metas_type = By.id("field-salesgoalsname");
	protected By controle_de_metas_data_inicio_date = By.id("field-startdt");
	protected By controle_de_metas_data_fim_date = By.id("field-enddt");
	protected By controle_de_metas_valor_number = By.id("field-goal");
	
	
	
	
	
	
	}
