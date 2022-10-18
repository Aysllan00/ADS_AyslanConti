package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

	@Test
	void CalcularFreteDHL() {
		CalculadoraFrete cf = new CalculadoraFrete();
		FreteGeral fg = new ServicoFreteDHL();
		
		double valorEsperado = 70.0;
		double valor = cf.calcularFrete(fg, 15.0);

		assertEquals(valorEsperado, valor);
	}
	
	@Test
	void CalcularFreteJadlog() {
		CalculadoraFrete cf = new CalculadoraFrete();
		FreteGeral fg = new ServicoFreteJadlog();
		
		double valorEsperado = 0.0;
		double valor = cf.calcularFrete(fg, 20.0);

		assertEquals(valorEsperado, valor);
	}
	
	@Test
	void CalcularFreteSedex() {
		CalculadoraFrete cf = new CalculadoraFrete();
		FreteGeral fg = new ServicoFreteSedex();
		
		double valorEsperado = 120.0;
		double valor = cf.calcularFrete(fg, 30.0);

		assertEquals(valorEsperado, valor);
	}
	
	@Test
	void CalcularFreteFedEx() {
		CalculadoraFrete cf = new CalculadoraFrete();
		FreteGeral fg = new ServicoFreteFedEx();
		
		double valorEsperado = 75.0;
		double valor = cf.calcularFrete(fg, 45.0);

		assertEquals(valorEsperado, valor);
	}
	/*
	@Test
	void CalcularFreteDHL() {
		CalculadoraFrete cf = new CalculadoraFrete();
		Double valor = cf.calcularFrete("dhl", 10);

		assertEquals(valor, 100.00);
	}

	@Test
	void CalcularFreteSedex() {
		CalculadoraFrete cf = new CalculadoraFrete();
		Double valor = cf.calcularFrete("sedex", 10);

		assertEquals(valor, 70.00);
	}

	@Test
	void CalcularFreteJadlog() {
		CalculadoraFrete cf = new CalculadoraFrete();
		Double valor = cf.calcularFrete("jadlog", 10);

		assertEquals(valor, 0.00);
	}

	@Test
	void CalcularFreteException() {
		try {
			CalculadoraFrete cf = new CalculadoraFrete();
			Double valor = cf.calcularFrete("fedex", 10);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	*/
	
	
}
