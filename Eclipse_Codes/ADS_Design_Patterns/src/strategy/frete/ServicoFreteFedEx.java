package strategy.frete;

public class ServicoFreteFedEx implements FreteGeral {

	@Override
	public double calculaValor(double pesoKg) {
		if (pesoKg < 20.0) {
			return 0.00;

		} else if (pesoKg > 20.10 && pesoKg <= 39.90) {
			return 45.00;

		} else {
			return 75.00;
		}

	}

}
