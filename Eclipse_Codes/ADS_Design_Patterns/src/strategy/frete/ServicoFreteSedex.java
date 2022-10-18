package strategy.frete;

public class ServicoFreteSedex implements FreteGeral {

	public double calculaValor(double pesoKg) {
		if (pesoKg < 20.00) {
			return 100.00;

		} else {
			return 120.00;
		}

	}
}
