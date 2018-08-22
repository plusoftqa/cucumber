package pages;

import org.openqa.selenium.By;

import executar.Util;
import locators.LocatorsAdmReclamacao;

public class PageAdmReclamacao extends LocatorsAdmReclamacao{
	Util u = new Util();

	public void digitar_Fabrica(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Fabrica_type).clear();
		u.Digitar(Fabrica_type, arg1);
	}

	public void checkbox_Fabrica() {
		// TODO Auto-generated method stub
		u.checkbox(Fabrica_fabrica_checkbox);
		
	}

	public void checkbox_Laboratorio() {
		// TODO Auto-generated method stub
		u.checkbox(Fabrica_laboratorio_checkbox);
		
	}

	public void digitar_Situacoes_da_embalagem(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Situacoes_da_embalagem_type).clear();
		u.Digitar(Situacoes_da_embalagem_type, arg1);
	}

	public void digitar_Prestadores_de_servico(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Prestador_de_servico_type).clear();
		u.Digitar(Prestador_de_servico_type, arg1);
	}

	public void digitar_Email(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Prestador_de_servico_email_type).clear();
		u.Digitar(Prestador_de_servico_email_type, arg1);
		
	}

	public void digitar_Contato(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Prestador_de_servico_contato_type).clear();
		u.Digitar(Prestador_de_servico_contato_type, arg1);
		
	}

	public void digitar_Motivos_do_lote_em_branco(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Motivos_do_lote_em_branco_type).clear();
		u.Digitar(Motivos_do_lote_em_branco_type, arg1);
		
	}

	public void digitar_Motivos_de_troca(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Motivos_de_troca_type).clear();
		u.Digitar(Motivos_de_troca_type, arg1);
	}

	public void digitar_Formas_de_ressarcimento(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Formas_de_ressarcimento_type).clear();
		u.Digitar(Formas_de_ressarcimento_type, arg1);
	}

	public void digitar_Formas_de_envio_de_amostra(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Formas_de_envio_de_amostra_type).clear();
		u.Digitar(Formas_de_envio_de_amostra_type, arg1);
		
	}

	public void digitar_Exposicao_do_produto(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(Exposicao_do_produto_type).clear();
		u.Digitar(Exposicao_do_produto_type, arg1);
		
	}

	public void digitar_Locais_de_compra(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_type).clear();
		u.Digitar(local_de_compra_type, arg1);
	}

	public void selecionar_Cidade(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(local_de_compra_cidade_select, arg1);
		
	}

	public void selecionar_Tipo_de_logradouro(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(local_de_compra_tipoe_de_logradouro_select, arg1);
	}

	public void digitar_Cep(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_CEP_type).clear();
		u.Digitar(local_de_compra_CEP_type, arg1);
	}

	public void digitar_Endereco(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_endereco_type).clear();
		u.Digitar(local_de_compra_endereco_type, arg1);
	}

	public void digitar_Numero(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_numero_type).clear();
		u.Digitar(local_de_compra_numero_type, arg1);
	}

	public void digitar_Complemento(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_complemento_type).clear();
		u.Digitar(local_de_compra_complemento_type, arg1);
		
	}

	public void digitar_Bairro(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_bairro_type).clear();
		u.Digitar(local_de_compra_bairro_type, arg1);
	}

	public void digitar_Referencia(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(local_de_compra_referencia_type).clear();
		u.Digitar(local_de_compra_referencia_type, arg1);
	}

	public void checkbox_Disponivel_para_busca() {
		// TODO Auto-generated method stub
		u.checkbox(local_de_compra_dispBusca_checkbox);
	}

	public void clicar_botao_Busca_CEP() throws Exception {
		// TODO Auto-generated method stub
		Util.Clicar(local_de_compra_buscarCEP_button);
		Thread.sleep(5000);
		Util.driver.switchTo().activeElement().findElement(By.xpath("//*[@class='modal-content']"));
		
	}

	public void digitar_Busca_Cep(String arg1) {
		// TODO Auto-generated method stub
		
		Util.driver.findElement(local_de_compra_buscaCEP_cep_type).clear();
		u.Digitar(local_de_compra_buscaCEP_cep_type, arg1);
	}

	public void clicar_botao_Buscar() throws Exception {
		// TODO Auto-generated method stub
		Util.Clicar(local_de_compra_buscaCEP_buscar_button);
		Thread.sleep(5000);
		Util.Clicar(local_de_compra_buscaCEP_list_result_result);
	}

	public void digitar_Tipos_de_terceiros(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipos_de_terceiros_type).clear();
		u.Digitar(tipos_de_terceiros_type, arg1);
	}

	public void digitar_Justificativa_do_laudo(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(justificativas_do_laudo_type).clear();
		u.Digitar(justificativas_do_laudo_type, arg1);
	}

	public void digitar_Laudo_padrao(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(laudo_padrao_type).clear();
		u.Digitar(laudo_padrao_type, arg1);
	}

	public void select_Tipo(String arg1) {
		// TODO Auto-generated method stub
		u.selectMenuAdm(laudo_padrao_tipo_select, arg1);
	}

	public void digitar_Laudo(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(laudo_padrao_laudo_type).clear();
		u.Digitar(laudo_padrao_laudo_type, arg1);
	}

	public void digitar_Origem_do_problema(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(origem_do_problema_type).clear();
		u.Digitar(origem_do_problema_type, arg1);
	}

	public void digitar_Procedentes(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(procedente_type).clear();
		u.Digitar(procedente_type, arg1);
		
	}

	public void digitar_Resultado_do_laudo(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(resultado_do_laudo_type).clear();
		u.Digitar(resultado_do_laudo_type, arg1);
	}

	public void digitar_Tipo_de_reembolso(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipo_reembolso_type).clear();
		u.Digitar(tipo_reembolso_type, arg1);
	}

	public void checkbox_Dados_bancarios() {
		// TODO Auto-generated method stub
		u.checkbox(tipo_reembolso_dados_bancarios_checkbox);
	}

	public void digitar_Tipo_de_envio(String arg1) {
		// TODO Auto-generated method stub
		Util.driver.findElement(tipo_de_envio_type).clear();
		u.Digitar(tipo_de_envio_type, arg1);
	}

}
