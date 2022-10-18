package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

	@Test
	void CalcularFreteDHL() {
		CalculadoraFrete cf = new CalculadoraFrete();
		FreteGeral fg = new FreteGeral();
		Double valor = cf.calcularFrete(frete, 0)

		assertEquals(valor, 100.00);
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
