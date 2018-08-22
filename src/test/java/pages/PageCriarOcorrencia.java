package pages;

import executar.Util;
import locators.LocatorsCadastrarPessoa;
import locators.LocatorsOcorrencia;

public class PageCriarOcorrencia extends LocatorsOcorrencia{
	
	Util u = new Util();
	LocatorsCadastrarPessoa pessoa = new LocatorsCadastrarPessoa();

	public void gerarProtocolo() throws Exception {
		Thread.sleep(3000);
		Util.driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Util.driver.switchTo().frame("f_rt_0");
		Thread.sleep(3000);

		Util.Clicar(pessoa.Gerar_protocolo);
		
	}

	public void abrirOcorrencia() throws Exception {
		// TODO Auto-generated method stub
		Util.Clicar(pessoa.mais);
		Thread.sleep(3000);
		Util.Clicar(pessoa.ocorrencia);
		Thread.sleep(3000);
	}

	public void preenchercamposobrigatorios() {
		// TODO Auto-generated method stub
		
	}

	public void criarfollowup() {
		// TODO Auto-generated method stub
		
	}

	public void salvarOcorrencia() {
		// TODO Auto-generated method stub
		
	}

	public void verificarCodigo() {
		// TODO Auto-generated method stub
		
	}

}
