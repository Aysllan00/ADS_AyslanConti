package templatemethod.relatorio.intro;

import java.util.List;

public class GeradorRelatorioVendasAnuais {

	private String getCabecalho() {
		String cabecalho = "Empresa My" + '\n' 
							+ "---------------";
		return cabecalho;
	}
	
	private String getRodape() {
		String rodape = "---------------------------------" + '\n' 
							+ "* Propriedade Particular - Uso confidencial";
		return rodape;
	}
	
	private List<String> getConteudo(Integer ano){
		List<String> conteudo = ServicoDeRelatorio.getInstance().getVendasAnual(ano);
		return conteudo;
	}
	
	public String criarPagina(Integer ano) {
		String cabecalho = getCabecalho();
		List<String> conteudo = getConteudo(ano);
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
