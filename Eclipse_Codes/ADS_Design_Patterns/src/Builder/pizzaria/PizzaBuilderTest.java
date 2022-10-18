package Builder.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Builder.carro.Carro;
import Builder.carro.CarroBuilderFluente;

class PizzaBuilderTest {

	@Test
	void PizzaValidaTest() {
		Pizza pizza = new PizzaBuilder()
				.setSize(1)
				.addCheese()
				.addPepperoni()
				.getPizza();

			assertNotNull(pizza);
			assertNotNull(pizza.getSize());
			assertNotNull(pizza.getFlagCheese());
			assertNotNull(pizza.getFlagPepperoni());
	}
	
	//Cenario negativo
	@Test
	void PizzaTamanhoInvalido(){
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(6)
					.addCheese()
					.addPepperoni()
					.getPizza();
			
			fail("Deveria ter lançado a exception");
		}
		catch(IllegalStateException e) {
			e.printStackTrace();
			
		}

	}
	
	@Test
	void PizzaSemIngrediente(){
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(1)
					.getPizza();
			
			fail("Deveria ter lançado a exception");
		}
		catch(IllegalStateException e) {
			e.printStackTrace();
			System.out.println("Pelo menos 1 ingrediente"); //sysout ctrl+espaço
			
		}

	}

}
