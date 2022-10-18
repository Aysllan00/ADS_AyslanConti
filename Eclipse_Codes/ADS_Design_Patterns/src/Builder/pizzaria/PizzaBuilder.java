package Builder.pizzaria;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder setSize(Integer size) {
		pizza.setSize(size);
		return this;
	}
	
	public PizzaBuilder addCheese() {
		pizza.setFlagCheese(true);
		return this;
	}
	
	public PizzaBuilder addPepperoni() {
		pizza.setFlagPepperoni(true);
		return this;
	}
	
	public Pizza getPizza() {
		validarIngredientes();
		validarTamanho();
		
		return pizza;
	}

	private void validarTamanho() {
		// TODO Auto-generated method stub
		Integer size = pizza.getSize();
		if(size !=1 && size !=2 && size != 3) {
			throw new IllegalStateException("Tamanho da pizza invalido");
		}
	}

	private void validarIngredientes() {
		// TODO Auto-generated method stub
		Boolean q = pizza.getFlagCheese();
		Boolean p = pizza.getFlagPepperoni();		
		if (q != true && p != true) {
			throw new IllegalStateException("Pelo menos 1 ingrediente");
		}
	}
	
}
