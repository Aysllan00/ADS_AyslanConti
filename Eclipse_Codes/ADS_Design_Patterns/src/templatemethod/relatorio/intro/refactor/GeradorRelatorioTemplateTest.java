package templatemethod.relatorio.intro.refactor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import templatemethod.relatorio.intro.GeradorRelatorioVendasAnuais;

class GeradorRelatorioTemplateTest {

	@Test
	void gerarRelatorioVendasMensais() {
		GeradorRelatorioTemplate template = new GeradorRelatorioVendasMensais(2022, 10);
		
		String pagina = template.criarPagina();
		
		System.out.println(pagina);
	}
	
	@Test
	void gerarRelatorioVendasAnuais() {
		GeradorRelatorioTemplate template = new templatemethod.relatorio.intro.refactor.GeradorRelatorioVendasAnuais(2022);
		
		String pagina = template.criarPagina();
		
		System.out.println(pagina);
	}
}
