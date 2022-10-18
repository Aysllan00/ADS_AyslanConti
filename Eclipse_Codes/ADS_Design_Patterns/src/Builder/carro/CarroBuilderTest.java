package Builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void carroBuildTest() {
		//partes
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		
		Motor motorVTEC = new Motor();
		
		ComputadorBordo computadorSiemens = new ComputadorBordo();
		
		FreioABS freioBosch = new FreioABS();
		
		//builder
		CarroBuilder carroBuilder = new CarroBuilder();
		
		carroBuilder.buildPortas(portas);
		carroBuilder.buildMotor(motorVTEC);
		carroBuilder.buildFreioABS(freioBosch);
		carroBuilder.buildComputadorBordo(computadorSiemens);
		
		//test carro construido
		Carro carroConstruido = carroBuilder.getCarro();
		
		assertNotNull(carroConstruido);
		assertNotNull(carroConstruido.getPortas());
		assertNotNull(carroConstruido.getMotor());
		assertNotNull(carroConstruido.getComputadorBordo());
		assertNotNull(carroConstruido.getFreioABS());
		
		assertEquals(carroConstruido.getPortas().length, 2);
		assertEquals(carroConstruido.getPortas().length, 4);
		
		
	}

}
