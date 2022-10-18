package Builder.carro;

public class CarroBuilder {

	private Carro carro;
	
	public Carro getCarro() {
		validarMotor();
		validarPortas();
		
		return carro;
	}
	
	private void validarMotor() {
		// TODO Auto-generated method stub
		if(carro.getMotor() == null) {
			throw new IllegalStateException("Carro deve ter motor"); //Metodo RuntimeException - Unchecked
		}
	}

	private void validarPortas() {
		// TODO Auto-generated method stub
		if(carro.getPortas() == null) {
			throw new IllegalStateException("Carro deve ter portas");
		}
		int numeroPortas = carro.getPortas().length;
		if (numeroPortas != 2 && numeroPortas != 4) {
			throw new IllegalStateException("Numero de Portas inavlido"+ numeroPortas);
		}
	}

	public CarroBuilder() {
		carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}

	public void buildMotor(Motor m) {
		carro.setMotor(m);
	}

	public void buildComputadorBordo(ComputadorBordo cb) { //Não valida pois são opcionais
		carro.setComputadorBordo(cb);
	}

	public void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}

	
	
}
