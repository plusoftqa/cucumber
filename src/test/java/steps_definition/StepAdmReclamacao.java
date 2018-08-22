package steps_definition;

import cucumber.api.java.en.Given;
import executar.Util;
import pages.PageAdmReclamacao;

public class StepAdmReclamacao {
	Util u = new Util();
	PageAdmReclamacao reclamacao = new PageAdmReclamacao();
	

@Given("^Digitar Fabrica \"([^\"]*)\"$")
public void digitar_Fabrica(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Fabrica(arg1);
    
}

@Given("^Checkbox Fabrica$")
public void checkbox_Fabrica() throws Exception {
    // Write code here that turns the phrase above into concrete actions
  reclamacao.checkbox_Fabrica();
}

@Given("^Checkbox Laboratorio$")
public void checkbox_Laboratorio() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    reclamacao.checkbox_Laboratorio();
}

@Given("^Digitar Situacoes da embalagem \"([^\"]*)\"$")
public void digitar_Situacoes_da_embalagem(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Situacoes_da_embalagem(arg1);
    
}


@Given("^Digitar Prestadores de servico \"([^\"]*)\"$")
public void digitar_Prestadores_de_servico(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    reclamacao.digitar_Prestadores_de_servico(arg1);
}

@Given("^Digitar Email \"([^\"]*)\"$")
public void digitar_Email(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
    reclamacao.digitar_Email(arg1);
}

@Given("^Digitar Contato \"([^\"]*)\"$")
public void digitar_Contato(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Contato(arg1);
}

@Given("^Digitar Motivos do lote em branco \"([^\"]*)\"$")
public void digitar_Motivos_do_lote_em_branco(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Motivos_do_lote_em_branco(arg1);
}

@Given("^Digitar Motivos de troca \"([^\"]*)\"$")
public void digitar_Motivos_de_troca(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Motivos_de_troca(arg1);

}

@Given("^Digitar Formas de ressarcimento \"([^\"]*)\"$")
public void digitar_Formas_de_ressarcimento(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Formas_de_ressarcimento(arg1);
}

@Given("^Digitar Formas de envio de amostra \"([^\"]*)\"$")
public void digitar_Formas_de_envio_de_amostra(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Formas_de_envio_de_amostra(arg1);
}

@Given("^Digitar Exposicao do produto \"([^\"]*)\"$")
public void digitar_Exposicao_do_produto(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
   reclamacao.digitar_Exposicao_do_produto(arg1);
}

@Given("^Digitar Locais de compra \"([^\"]*)\"$")
public void digitar_Locais_de_compra(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Locais_de_compra(arg1);
}

@Given("^Selecionar Cidade \"([^\"]*)\"$")
public void selecionar_Cidade(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.selecionar_Cidade(arg1);
}

@Given("^Selecionar Tipo de logradouro \"([^\"]*)\"$")
public void selecionar_Tipo_de_logradouro(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.selecionar_Tipo_de_logradouro(arg1);
}

@Given("^Digitar Cep \"([^\"]*)\"$")
public void digitar_Cep(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Cep(arg1);
}

@Given("^Digitar Endereco \"([^\"]*)\"$")
public void digitar_Endereco(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Endereco(arg1);
}

@Given("^Digitar Numero \"([^\"]*)\"$")
public void digitar_Numero(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Numero(arg1);
}

@Given("^Digitar Complemento \"([^\"]*)\"$")
public void digitar_Complemento(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Complemento(arg1);
}

@Given("^Digitar Bairro \"([^\"]*)\"$")
public void digitar_Bairro(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Bairro(arg1);
}

@Given("^Digitar Referencia \"([^\"]*)\"$")
public void digitar_Referencia(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Referencia(arg1);
}

@Given("^checkbox Disponivel para busca$")
public void checkbox_Disponivel_para_busca() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.checkbox_Disponivel_para_busca();
}

@Given("^Clicar botao Busca CEP$")
public void clicar_botao_Busca_CEP() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.clicar_botao_Busca_CEP();
}

@Given("^Digitar Busca Cep \"([^\"]*)\"$")
public void digitar_Busca_Cep(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Busca_Cep(arg1);
}

@Given("^Clicar botao Buscar$")
public void clicar_botao_Buscar() throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.clicar_botao_Buscar();
}

@Given("^Digitar Tipos de terceiros \"([^\"]*)\"$")
public void digitar_Tipos_de_terceiros(String arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Tipos_de_terceiros(arg1);
}

@Given("^Digitar Justificativa do laudo \"([^\"]*)\"$")
public void digitar_Justificativa_do_laudo(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Justificativa_do_laudo(arg1);
}

@Given("^Digitar Laudo padrao \"([^\"]*)\"$")
public void digitar_Laudo_padrao(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Laudo_padrao(arg1);
}

@Given("^Select Tipo \"([^\"]*)\"$")
public void select_Tipo(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.select_Tipo(arg1);
}

@Given("^Digitar Laudo \"([^\"]*)\"$")
public void digitar_Laudo(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Laudo(arg1);
}

@Given("^Digitar Origem do problema \"([^\"]*)\"$")
public void digitar_Origem_do_problema(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Origem_do_problema(arg1);
}

@Given("^Digitar Procedentes \"([^\"]*)\"$")
public void digitar_Procedentes(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Procedentes(arg1);
}

@Given("^Digitar Resultado do laudo \"([^\"]*)\"$")
public void digitar_Resultado_do_laudo(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Resultado_do_laudo(arg1);
}

@Given("^Digitar Tipo de reembolso \"([^\"]*)\"$")
public void digitar_Tipo_de_reembolso(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Tipo_de_reembolso(arg1);
}

@Given("^Checkbox Dados bancarios$")
public void checkbox_Dados_bancarios() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.checkbox_Dados_bancarios();
}

@Given("^Digitar Tipo de envio \"([^\"]*)\"$")
public void digitar_Tipo_de_envio(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	reclamacao.digitar_Tipo_de_envio(arg1);
}
}
