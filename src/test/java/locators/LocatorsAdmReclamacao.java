package locators;

import org.openqa.selenium.By;

public class LocatorsAdmReclamacao {
	
	protected By Fabrica_type = By.id("field-prodfactory");
	protected String Fabrica_fabrica_checkbox = "field-factory";
	protected String Fabrica_laboratorio_checkbox = "field-laboratory";
	//Situações da Embalagem	
	protected By Situacoes_da_embalagem_type = By.id("field-prodpackagesituation");
	//Prestadores de serviço
	protected By Prestador_de_servico_type = By.id("field-prodserviceprovider");
	protected By Prestador_de_servico_email_type = By.id("field-email");
	protected By Prestador_de_servico_contato_type = By.id("field-contactname");
	// Motivos do lote em branco
	protected By Motivos_do_lote_em_branco_type = By.id("field-prodlotunfilledreason");
	//Motivos de troca
	protected By Motivos_de_troca_type = By.id("field-prodchangereason");
	//formas de ressarcimento
	protected By Formas_de_ressarcimento_type = By.id("field-prodrepaymentform");
	//formas de envio de amostra
	protected By Formas_de_envio_de_amostra_type = By.id("field-ds_prodsamplesubmission");
	//exposição do produto
	protected By Exposicao_do_produto_type = By.id("field-proddisplayed");
	//Locais de compra
	protected By local_de_compra_type = By.id("field-prodpurchaseplace");
	protected By local_de_compra_pais_select = By.id("field-countryid");
	protected By local_de_compra_estado_select = By.id("field-stateid");
	protected By local_de_compra_cidade_select = By.id("field-cityid");
	protected By local_de_compra_tipoe_de_logradouro_select = By.id("field-tpstreetid");
	protected By local_de_compra_CEP_type = By.id("field-zipcode");
	protected By local_de_compra_endereco_type = By.id("field-address");
	protected By local_de_compra_numero_type = By.id("field-number");
	protected By local_de_compra_complemento_type = By.id("field-addressdetail");
	protected By local_de_compra_bairro_type = By.id("field-neighborhood");
	protected By local_de_compra_referencia_type = By.id("field-addressreference");
	protected String local_de_compra_dispBusca_checkbox = "field-availableserach";
	//Locais de compra > Busca por CEP
	protected By local_de_compra_buscarCEP_button = By.xpath("//button[@ng-controller='plusoftcrm.utils.v2.staticjs.controller.cep']");
	protected By local_de_compra_buscaCEP_cancelar_button = By.xpath("//button[@class='btn btn-sm btn-default']");
	protected By local_de_compra_buscaCEP_limpar_button = By.xpath("//button[@class='btn btn-sm btn-success']");
	protected By local_de_compra_buscaCEP_buscar_button = By.xpath("//button[@class='btn btn-sm btn-primary']");
	protected By local_de_compra_buscaCEP_cep_type = By.id("txt-adr_address-ds_zipcode");
	protected By local_de_compra_buscaCEP_UF_type = By.id("txt-adr_address-ds_state");
	protected By local_de_compra_buscaCEP_cidade_type = By.id("txt-adr_address-ds_city");
	protected By local_de_compra_buscaCEP_endereco_type = By.id("txt-adr_address-ds_address");
	protected By local_de_compra_buscaCEP_list_result_result = By.xpath("//table//tbody//tr//span");
	//Tipos de terceiros
	protected By tipos_de_terceiros_type = By.id("field-thirdparty");
	//Justificativas do laudo
	protected By justificativas_do_laudo_type = By.id("field-prodreportjustification");
	//Laudo Padrao
	protected By laudo_padrao_type = By.id("field-prodreportdefault");
	protected By laudo_padrao_tipo_select = By.id("field-type");
	protected By laudo_padrao_laudo_type = By.id("field-tx_prodreportdefault");
	//Origens do problema
	protected By origem_do_problema_type = By.id("field-prodsourceproblem");
	//Procedentes
	protected By procedente_type = By.id("field-prodreportproceeds");
	//Resultados do laudo
	protected By resultado_do_laudo_type =  By.id("field-prodreportresult");
	//Tipo de reembolso
	protected By tipo_reembolso_type = By.id("field-caserepaytype");
	protected String tipo_reembolso_dados_bancarios_checkbox = "field-needbankdata";
	//Tipos de envio
	protected By tipo_de_envio_type = By.id("field-casesamplersendtype");
	
	
}
