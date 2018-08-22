package locators;

import org.openqa.selenium.By;

public class LocatorsOcorrencia {
	//OCORRENCIA UNIVERSAL
	protected By ocorrencia_universal_time_select = By.id("field-teamid");
	protected By ocorrencia_universal_responsavel_select = By.id("field-usersresponsibleid");
	protected By ocorrencia_universal_prazo_number = By.id("field-timeframe");
	protected By ocorrencia_universal_tipo_de_prazo_select = By.id("field-timeframetype");
	protected By ocorrencia_universal_grade_de_horarios_select = By.id("field-timetablekey");
	protected By ocorrencia_universal_assunto_select = By.id("field-casereasoncategoryid");
	protected By ocorrencia_universal_grupo_de_assunto_select = By.id("field-casereasongroupid");
	protected By ocorrencia_universal_tipo_de_ocorrencia_select = By.id("field-casetypemainid");
	protected By ocorrencia_universal_grupo_de_tipo_de_ocorrencia_select = By.id("field-casetypegroupid");
	protected By ocorrencia_universal_escalonamento_select = By.id("field-escalationid");
	protected By ocorrencia_universal_processo_select = By.id("field-processid");
	protected By ocorrencia_universal_ao_atendente_select = By.id("field-directattendant");
	protected By ocorrencia_universal_texto_padrao_select = By.id("field-casedefaultdescriptionid");
	protected By ocorrencia_universal_status_select = By.id("field-casestatusid");
	protected By ocorrencia_universal_prioridade_select = By.id("field-casepriorityid");
	protected By ocorrencia_universal_classificacao_select = By.id("field-caseclassificationid");
	protected By ocorrencia_universal_encerrar_automaticamente_select = By.id("field-shallterminate");
	protected By ocorrencia_universal_motivo_de_encerramento_select = By.id("field-caseconclusiontypeid");
	//CONFIGURACOES DE OCORRENCIA
	protected By config_ocorrencia_tmp_md_atend_number = By.id("field-tma");
	protected String config_ocorrencia_ligacao_assunto_vs_ocorrencia_checkbox = "field-reasonxcasetype";
	protected String config_ocorrencia_utilizar_busca_codigo_corp_produto_checkbox = "field-showcasereasoncode";
	protected String config_ocorrencia_protocolo_customizavel_checkbox = "field-docustomizedprotocol";
	protected By config_ocorrencia_protocolo_type = By.id("field-customizedprotocol");
	protected By config_ocorrencia_Assunto_email_notif_pendencias_vencidas = By.id("field-notifyafteremailsubject");
	protected By config_ocorrencia_texto_email_notifi_pendencias_vencidas_type = By.id("field-notifyafteremailsubject");
	protected By config_ocorrencia_emails_copia_notif_pendencias_vencidas_type = By.id("field-notifyafteremailcc");
	protected By config_ocorrencia_assunto_email_notof_pendencias_vencer_type = By.id("field-notifybeforeemailsubject");
	protected By config_ocorrencia_texto_email_notif_pendencias_vencer_type = By.id("field-inputnotifybeforeemailbody");
	protected By config_ocorrencia_emails_copia_notif_pendencias_vencer_type = By.id("field-inputnotifybeforeemailbody");
	//GRAU DE SATISFACAO
	protected By grau_de_satisfacao_type = By.id("field-casesatisfactionname");
	//CLASSIFICACOES
	protected By classificacoes_type = By.id("field-caseclassificationname");
	//PRIORIDADES
	protected By prioridades_type = By.id("field-priorityname");
	//STATUS
	protected By status_ocorrencia_type = By.id("field-statusname");
	//TEXTOS PADRAO
	protected By textos_padrao_type = By.id("field-casedefaultdescription");
	protected By textos_padrao_descricao_type = By.id("field-inputdescription");
	//EVENTOS DE FOLLOW - UP
	protected By eventos_followUp_type = By.id("field-casefollowuptypename");
	protected By eventos_followUp_texto_do_evento_type = By.id("field-inputdefaultdescription");
	//MOTIVO DE ENCERRAMENTO
	protected By motivo_de_ocorrencia_type = By.id("field-conclusiontypename");
	protected By motivo_de_ocorrencia_texto_de_motivo_encerramento_type = By.id("field-inputconclusiontext");
	//CATEGORIA DE ASSUNTO
	protected By categoria_de_assunto_type = By.id("field-casereasoncategoryname");
	//GRUPO DE ASSUNTO
	protected By grupo_de_assunto_type = By.id("field-casereasongroupname");
	//ASUNTO
	protected By assunto_cod_corporativo_type = By.id("field-integration");
	protected By assunto_assunto_type = By.id("field-casereasonname");
	protected By assunto_valor = By.id("field-casereasonvalue");
	//TIPO DE OCORRENCIA
	protected By tipo_de_ocorrencia_type = By.id("field-casetypemainname");
	protected By grupo_de_tipo_de_ocorrencia_type = By.id("field-casetypemainname");
		//OCORRENCIA
	protected By ocorrencia_type = By.id("field-casetypename");
	protected By ocorrencia_eventos_follow_up_select = By.id("field-casefollowuptypeid");
	protected By ocorrencia_texto_padrao_de_atendimento_type = By.id("field-inputdefaultdescription");
	protected By ocorrencia_texto_de_encerramento_type = By.id("field-inputdefaultconclusion");
	//GRUPO DE ATENDIMENTO
	protected By ocorrencia_grupo_de_atendimento_type = By.id("field-casetypereasongroup");
	//MOTIVOS DE OCORRENCIAS
	protected By ocorrencia_motivos_de_ocorrencia_type = By.id("field-casetypereasonds");
	protected By ocorrencia_motivos_de_ocorrencia_grupo_atendimento_select = By.id("field-casetypereasongroupid");
	protected By ocorrencia_motivos_de_ocorrencia_assunto_select = By.id("field-casereasonid");
	protected By ocorrencia_motivos_de_ocorrencia_ocorrencia_select = By.id("field-casetypeid");
	protected String ocorrencia_motivos_de_ocorrencia_servico_de_integracao_checkbox = "field-availableservice";
	protected String ocorrencia_motivos_de_ocorrencia_chat_checkbox = "field-availablechat";
	protected String ocorrencia_motivos_de_ocorrencia_email_checkbox = "field-availableemail";
	protected String ocorrencia_motivos_de_ocorrencia_acesso_rapido = "field-availablequickly";
	protected By ocorrencia_motivos_de_ocorrencia_texto_padrao_de_atendimento_type = By.id("field-inputtxdefaultdescription");
	protected By ocorrencia_motivos_de_ocorrencia_congelar_tempo_de_atendimento_select = By.id("field-allowfreeze");
	protected By ocorrencia_motivos_de_ocorrencia_texto_encerramento_type = By.id("field-inputtxdefaultconclusion");
	//MOTIVOS DE CONGELAMENTO
	protected By ocorrencia_motivos_de_congelamento_type = By.id("field-casefreezereason");
	//TERCEIROS
	protected By ocorrencia_terceiros_type = By.id("field-thirdparttype");
	
	
	
}	
