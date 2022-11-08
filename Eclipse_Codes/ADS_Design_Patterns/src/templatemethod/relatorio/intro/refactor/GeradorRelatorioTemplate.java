package templatemethod.relatorio.intro.refactor;

import java.util.List;

import templatemethod.relatorio.intro.ServicoDeRelatorio;

public abstract class GeradorRelatorioTemplate {
	
	private String getCabecalho() {
		String cabecalho = "Empresa My" + '\n' 
							+ "-------------------";
		return cabecalho;
	}
	
	private String getRodape() {
		String rodape = "---------------------------------" + '\n' 
							+ "* Propriedade Particular - Uso confidencial";
		return rodape;
	}
	
	//Metodo template - Polimorfismo - Delega a classe conteudo para a sub-classe
	public abstract List<String> getConteudo();
	
	public String criarPagina() {
		String cabecalho = getCabecalho();
		List<String> conteudo = getConteudo();
		String rodape = getRodape();
		
		//Formatação do texto
		StringBuffer bufferPagina = new StringBuffer(); //Concatena String
		bufferPagina.append(cabecalho);
		
		for(String linha : conteudo) {
			bufferPagina.append('\n');
			bufferPagina.append(linha);
		}
		bufferPagina.append('\n');
		
		bufferPagina.append(rodape);
		
		return bufferPagina.toString();
	}
	
}
