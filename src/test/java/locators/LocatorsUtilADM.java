package locators;

import org.openqa.selenium.By;

public class LocatorsUtilADM {
	// validar msg
	protected String Msg_Erro = "div[class='ui-notification ng-scope error clickable']";
	protected String Msg_sucesso = "*//div[@class='ui-notification ng-scope success clickable']";
	
	
	//modulos
	protected String Menu = "li[role=user-menu]";
	protected String ModuloADM = "a[href*='?m=menu.admin']";
	protected String ModuloCallCenter = "a[href*='?m=menu.main.callcenter']";
	
	//MENUS ADMINISTRATIVO
	//protected String MenuPessoa = "li[data-menu-id='menu.admin.person']";
	//protected String SubmenuCargo = "a[href='/forms-v2/finder/CRM_JOBTITLE']";
	//MENU CALENDARIO
	protected String calendarioAdm = "li[data-menu-id='menu.admin.timetable']";
	protected String calendario_feriados = "a[href='/forms/inpaas.time.forms.holiday.list/']";
	protected String calendario_grade_de_horarios = "a[href='/forms/inpaas.time.forms.timetable.list/']";
	//MENU USUARIO
	protected String usuario = "li[data-menu-id='menu.admin.user']";
	protected String usuario_grupo_de_usuario = "a[href='/forms/plusoftcrm.utils.forms.core_usergroup.list/']";
	protected String usuario_times = "a[href='/forms-v2/finder/CRM_TEAM']";
	protected String usuario_departamentos = "a[href='/forms-v2/finder/CRM_DEPARTMENT']";
	protected String usuario_usuarios = "a[href='/forms/plusoftcrm.utils.forms.crm_user.list/']";
	protected String usuario_provedores_de_acesso = "a[href='/forms/plusoftcrm.user.forms.adfs.main/']";
	protected String usuario_seguranca = "a[href='/forms/plusoftcrm.user.forms.configsecurity.list/']";
	//LOCALIZACAO
	protected String localizacao = "li[data-menu-id='menu.admin.localization']";
	protected String localizacao_pais = "a[href='/forms-v2/finder/CRM_COUNTRY']";
	protected String localizacao_regioes = "a[href='/forms-v2/finder/CRM_REGION']";
	protected String localizacao_estados = "a[href='/forms-v2/finder/CRM_STATE']";
	protected String localizacao_cidades = "a[href='/forms-v2/finder/CRM_CITY']";
	protected String localizacao_tip_end = "a[href='/forms-v2/finder/CRM_TPADDRESS']";
	protected String localizacao_tip_logra = "a[href='/forms-v2/finder/CRM_TPSTREET']";
//	PESSOA
	protected String pessoa = "li[data-menu-id='menu.admin.person']";
	protected String pessoa_configuracoes_pessoa = "a[href='/forms-v2/finder/CRM_CONFIGPERSON']";
	protected String pessoa_cargo = "a[href='/forms-v2/finder/CRM_JOBTITLE']";
	protected String pessoa_profissao = "a[href='/forms-v2/finder/CRM_JOB']";
	protected String pessoa_estado_civil = "a[href='/forms-v2/finder/CRM_MARITALSTATUS']";
	protected String pessoa_relacoes_entre_pessoas = "a[href='/forms-v2/finder/CRM_PERSONRELATIONTYPE']";
	protected String pessoa_formas_tratamento = "a[href='/forms-v2/finder/CRM_PERSONTITLE']";
	protected String pessoa_segmentos_empresarial = "a[href='/forms-v2/finder/CRM_SEGMENTCORP']";
	protected String pessoa_tipos_publico = "a[href='/forms-v2/finder/CRM_PERSONTYPE']";
	protected String pessoa_pessoas_nao_identificadas = "a[href='/forms-v2/finder/CRM_PERSONNOTINFORMED']";
	protected String pessoa_tipos_de_origem = "a[href='/forms-v2/finder/CRM_PERSONORIGINTYPE']";
	protected String pessoa_origens = "a[href='/forms-v2/finder/CRM_PERSONORIGIN']";
	protected String pessoa_status = "a[href='/forms-v2/finder/CRM_PERSONSTATUS']";
	protected String pessoa_classificacoes = "a[href='/forms-v2/finder/CRM_PERSONCLASSIFICATION']";
	protected String pessoa_portes = "a[href='/forms-v2/finder/CRM_PERSONCOMPANYSIZE']";
	protected String pessoa_unificacao_cadastral = "a[href='/forms/plusoftcrm.person.forms.crm_person.cadastralduplicity/']";
//	Atendimento
	protected String atendimento = "li[data-menu-id='menu.admin.ticket']";
	protected String atendimento_como_localizou = "a[href='/forms-v2/finder/CRM_TICKETHOWYOUKNOW']";
	protected String atendimento_midias = "a[href='/forms-v2/finder/CRM_TICKETMEDIA']";
	protected String atendimento_tipos_de_retorno = "a[href='/forms-v2/finder/CRM_TICKETPREFERENCERETURN']";
	protected String atendimento_estados_de_animo = "a[href='/forms-v2/finder/CRM_TICKETMOOD']";
	protected String atendimento_formas_de_contato = "a[href='/forms-v2/finder/CRM_CASEORIGIN']";
//	RECLAMAÇÃO
	protected String reclamacao = "li[data-menu-id='menu.admin.lot']";
	protected String reclamcao_fabrica = "a[href='/forms-v2/finder/CRM_PRODFACTORY']";
	protected String reclamcao_situacao_embalagem = "a[href='/forms-v2/finder/CRM_PRODPACKAGESITUATION']";
	protected String reclamacao_prestadores_de_serviço = "a[href='/forms-v2/finder/CRM_PRODSERVICEPROVIDER']";
	protected String reclamacao_motivos_de_lote_em_branco = "a[href='/forms-v2/finder/CRM_PRODLOTUNFILLEDREASON']";
	protected String reclamacao_motivos_de_troca = "a[href='/forms-v2/finder/CRM_PRODCHANGEREASON']";
	protected String reclamcao_formas_de_ressarcimento = "a[href='/forms-v2/finder/CRM_PRODREPAYMENTFORM']";
	protected String reclamacao_formas_de_envio_de_amostra = "a[href='/forms-v2/finder/CRM_PRODSAMPLESUBMISSION']";
	protected String reclamacao_exposicoes_de_produto = "a[href='/forms-v2/finder/CRM_PRODDISPLAYED']";
	protected String reclamacao_locais_de_compra = "a[href='/forms-v2/finder/CRM_PRODPURCHASEPLACE']";
	protected String reclamacao_condicoes_dE_uso = "a[href='/forms-v2/finder/CRM_PRODUSECONDITION']";
	protected String reclamacao_tipos_de_terceiro = "a[href='/forms-v2/finder/CRM_CASETHIRDPARTY']";
	protected String reclamacao_justificativas_de_laudo = "a[href='/forms-v2/finder/CRM_PRODREPORTJUSTIFICATION']";
	protected String reclamacao_laudo_padrao = "a[href='/forms-v2/finder/CRM_PRODREPORTDEFAULT']";
	protected String reclamacao_origens_do_problema = "a[href='/forms-v2/finder/CRM_PRODSOURCEPROBLEM']";
	protected String reclamacao_procedentes = "a[href='/forms-v2/finder/CRM_PRODREPORTPROCEEDS']";
	protected String reclamacao_resultados_do_laudo = "a[href='/forms-v2/finder/CRM_PRODREPORTRESULT']";
	protected String reclamacao_tipos_de_reembolso = "a[href='/forms-v2/finder/CRM_CASEREPAYTYPE']";
	protected String reclamacao_tipos_de_envio = "a[href='/forms-v2/finder/CRM_CASESAMPLERSENDTYPE']";
//	FORÇA DE VENDAS
	protected String forcadeVendas = "li[data-menu-id='menu.admin.sfa']";
	protected String forcadeVendas_notificacao = "a[href='/forms-v2/finder/CRM_SFANOTIFICATION']";
	protected String forcadeVendas_tipo_de_negocio = "a[href='/forms-v2/finder/CRM_OPORTUNITYBUSINESS']";
	protected String forcadeVendas_unidades_de_negocio = "a[href='/forms-v2/finder/CRM_BUSINESSUNIT']";
	protected String forcadeVendas_produto = "a[href='/forms-v2/finder/CRM_OPORTUNITYPRODUCT']";
	protected String forcadeVendas_estagios_de_oportunidades = "a[href='/forms-v2/finder/CRM_OPORTUNITYSTAGE']";
	protected String forcadeVendas_estagios_de_negociacao = "a[href='/forms-v2/finder/CRM_BUSINESSSTAGE']";
	protected String forcadeVendas_status = "a[href='/forms-v2/finder/CRM_OPORTUNITYSTATUS']";
	protected String forcadeVendas_objecoes = "a[href='/forms-v2/finder/CRM_OPORTUNITYOBJECTION']";
	protected String forcadeVendas_tempos = "a[href='/forms-v2/finder/CRM_OPORTUNITYFORECAST']";
	protected String forcadeVendas_orcamentos = "a[href='/forms-v2/finder/CRM_OPORTUNITYBUDGET']";
	protected String forcadeVendas_origem_das_oportunidades = "a[href='/forms-v2/finder/CRM_OPORTUNITYORIGIN']";
	protected String forcadeVendas_niveis_de_interesse = "a[href='/forms-v2/finder/CRM_OPORTUNITYINTEREST']";
	protected String forcadeVendas_sucessos_da_oportunidade = "a[href='/forms-v2/finder/CRM_OPPORTUNITYSUCCESSREASON']";
	protected String forcadeVendas_niveis_decisorios = "a[href='/forms-v2/finder/CRM_CONTACTROLE']";
	protected String forcadeVendas_necessidades = "a[href='/forms-v2/finder/CRM_OPPORTUNITYNEED']";
	protected String forcadeVendas_parceiros = "a[href='/forms-v2/finder/CRM_PARTNER']";
	protected String forcadeVendas_autoridades = "a[href='/forms-v2/finder/CRM_OPPORTUNITYAUTHORITY']";
	protected String forcadeVendas_papeis_de_parceiro = "a[href='/forms-v2/finder/CRM_PARTNERROLE']";
	protected String forcadeVendas_concorrentes = "a[href='/forms-v2/finder/CRM_COMPETITOR']";
	protected String forcadeVendas_tipos_de_despesas= "a[href='/forms-v2/finder/CRM_EVENTCOSTTYPE']";
	protected String forcadeVendas_transferencia_de_oportunidades = "a[href='/forms/plusoftcrm.sfa.transfers.opportunity/']";
	protected String forcadeVendas_transferencia_de_contas = "a[href='/forms/plusoftcrm.sfa.transfers.person/']";
	protected String forcadeVendas_controle_de_metas = "a[href='/forms-v2/finder/CRM_SALESGOALS']";
//	OCORRENCIA 
	protected String ocorrencia = "li[data-menu-id='menu.admin.case']";
	protected String ocorrencias_configuracoes_de_ocorrencia = "a[href='/forms-v2/finder/CRM_CONFIGCASE']";
	protected String ocorrencias_grau_de_satisfacao = "a[href='/forms-v2/finder/CRM_CASESATISFACTION']";
	protected String ocorrencias_classificacoes = "a[href='/forms-v2/finder/CRM_CASECLASSIFICATION']";
	protected String ocorrencias_prioridades = "a[href='/forms-v2/finder/CRM_CASEPRIORITY']";
	protected String ocorrencias_status = "a[href='/forms-v2/finder/CRM_CASESTATUS']";
	protected String ocorrencias_textos_padrao = "a[href='/forms-v2/finder/CRM_CASEDEFAULTDESCRIPTION']";
	protected String ocorrencias_eventos_de_followUp = "a[href='/forms-v2/finder/CRM_CASEFOLLOWUPTYPE']";
	protected String ocorrencias_motivos_de_encerramento = "a[href='/forms-v2/finder/CRM_CASECONCLUSIONTYPE']";
	protected String ocorrencias_categorias_de_assunto = "a[href='/forms-v2/finder/CRM_CASEREASONCATEGORY']";
	protected String ocorrencias_grupos_de_assunto = "a[href='/forms-v2/finder/CRM_CASEREASONGROUP']";
	protected String ocorrencias_assuntos = "a[href='/forms/plusoftcrm.case.forms.crm_casereason.list/']";
	protected String ocorrencias_tipos_de_ocorrencia = "a[href='/forms-v2/finder/CRM_CASETYPEMAIN']";
	protected String ocorrencias_grupo_de_tipo_de_ocorrencia = "a[href='/forms/plusoftcrm.case.forms.crm_casetypegroup.list/']";
	protected String ocorrencias_ocorrencia = "a[href='/forms/plusoftcrm.case.forms.crm_casetype.list/']";
	protected String ocorrencias_grupos_de_atendimento = "a[href='/forms-v2/finder/CRM_CASETYPEREASONGROUP']";
	protected String ocorrencias_motivos_de_ocorrencia = "a[href='/forms/plusoftcrm.case.forms.crm_casetypereason.list/']";
	protected String ocorrencias_motivos_de_congelamento = "a[href='/forms-v2/finder/CRM_CASEFREEZEREASON']";
	protected String ocorrencias_terceiros = "a[href='/forms-v2/finder/CRM_CASETHIRDPARTTYPE']";
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected
//	protected String pessoa = "li[data-menu-id='menu.admin.person']";
	
	
	//Botoes padrao 
	protected String novov1 = "button[role='new']";
	protected String salvar_e_novov1 = "button[role='save']";
	protected String salvarv1 = "//*[@role='save'][2]";
	protected String editarv1 = "//td[contains(@class,'table-row-actions')]/span[1]/button[1]";
	protected String removerv1_1 = "//td[contains(@class,'table-row-actions')]/span[1]/button[2]";
	protected String removerv1 = ".//*[@class='btn btn-danger']";
	protected String duplicarv1 = "//*[@class='btn btn-success']";
	protected String cancelarv1 = "button[role='cancel']";
	protected String confirmarv1 = "//*[@class='modal-content']/div[3]/button[2]";
	protected String associarModuloGrupodeUsuarios = "button[id='btn-add-module']";
	protected String associarUsuarioGrupodeusuario = "button[role='child-new']";
	protected String removerModuloGrupodeusuarios = "//td//*[@role='dom-remove']";
	protected String removerUsuarioGrupodeusuarios = "//td//*[@role='child-remove']";
	protected String permissao = ".//*[@class='btn btn-warning']";
	protected String buscarv1botao = "button[role='filter']";
	protected String salvarv1modal = "//*[@class='modal-content']/div[3]/button[4]";
	protected String novo = "button[aria-label='new']";
	protected String cancelar = "button[aria-label='cancel']";
	protected String mais = "button[aria-label='pageactions.more']";
	protected String salvarenovo = "a[aria-label='savenew']";
	protected String salvar = "button[aria-label='save']";
	protected String remover = "button[aria-label='remove']";
	protected String duplicar = "a[aria-label='duplicate']";
	protected String editar = "button[aria-label='edit']";
	protected String remover_busca = "button[aria-label='remove']";
	
	
	
	
	
	//Tooltips
	protected String printv1 = "a[title='Imprimir']";
	protected String copiarv1 = "a[title='Copiar']";
	protected String csvv1 = "a[title='Exportar CSV']";
	protected String pdfv1 = "a[title='Exportar PDF']";

	
	
	//Campo buscar
	protected By buscarv1 = By.xpath("//*[@role='client-filter-field']");
	protected By buscarv1todos = By.xpath("//input[@role='filter-field']");
	protected By buscarv2 = By.id("txt-finder-term");
	
	
	
	
	
	

}
