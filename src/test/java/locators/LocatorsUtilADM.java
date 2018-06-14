package locators;

import org.openqa.selenium.By;

public class LocatorsUtilADM {
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
