package Builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderFluenteTest {

	@Test
	void test() {
		//partes
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		
		Motor motorVTEC = new Motor();
		
		ComputadorBordo computadorSiemens = new ComputadorBordo();
		
		FreioABS freioBosch = new FreioABS();
				
		//builder
		/*
		Carro carro = new CarroBuilderFluente()
			.buildPortas(portas)
			.buildMotor(motorVTEC)
			.buildFreioABS(freioBosch)
			.buildComputadorBordo(computadorSiemens);
			
		
		assertNotNull(carro);
		assertNotNull(carro.getPortas());
		assertNotNull(carro.getMotor());
		assertNotNull(carro.getComputadorBordo());
		assertNotNull(carro.getFreioABS());
		
		*/
	}

}
