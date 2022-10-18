package strategy.frete;

public class CalculadoraFrete {

	public double calcularFrete(FreteGeral frete, double pesoKg) {
		
		double valor = frete.calculaValor(pesoKg);
		return valor;
	}
}
