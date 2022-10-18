package strategy.frete;

public class ServicoFreteDHL implements FreteGeral {

	@Override
	public double calculaValor(double pesoKg) {
		if (pesoKg < 10.0) {
			return 50.00;

		} else if (pesoKg < 20.00) {
			return 70.00;

		} else {
			return 90.00;
		}

	}
}
