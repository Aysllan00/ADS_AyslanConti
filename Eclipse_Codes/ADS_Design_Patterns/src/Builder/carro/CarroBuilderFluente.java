package Builder.carro;

public class CarroBuilderFluente {

	private Carro carro;
	
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public Carro getCarro() {
		
		return carro;
	}
	
	public CarroBuilderFluente buildPortas(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}

	public CarroBuilderFluente buildMotor(Motor m) {
		carro.setMotor(m);
		return this;		
	}

	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) { //Não valida pois são opcionais
		carro.setComputadorBordo(cb);
		return this;		
	}

	public CarroBuilderFluente buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
		return this;		
		
	}

	
}
