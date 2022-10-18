package strategy.frete;

public class ServicoFreteJadlog implements FreteGeral {

	public double calculaValor(double pesoKg) {
		if (pesoKg < 30.00) {
			return 0.00;
		} else {
			return 150.00;
		}

	}
}
