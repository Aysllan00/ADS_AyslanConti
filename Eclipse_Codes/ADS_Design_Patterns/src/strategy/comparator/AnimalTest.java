package strategy.comparator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void OrdenarAnimaisNome() {
		List<Animal> listaAnimais = new ArrayList<>();

		listaAnimais.add(new Animal(1L, "Tartaruga"));
		listaAnimais.add(new Animal(2L, "Coelho"));
		listaAnimais.add(new Animal(3L, "Cachorro"));
		listaAnimais.add(new Animal(4L, "Gato"));
		listaAnimais.add(new Animal(5L, "Girafa"));
		listaAnimais.add(new Animal(6L, "Gato"));

		System.out.println("Lista Original");
		listaAnimais.forEach(System.out::println);

		System.out.println("  ");
		
		listaAnimais.sort(new ComparadorNome());
		System.out.println("Lista ordenada por nome: ");
		listaAnimais.forEach(System.out::println);
	}
	
	@Test
	void OrdenarAnimaisId() {
		List<Animal> listaAnimais = new ArrayList<>();

		listaAnimais.add(new Animal(13L, "Tartaruga"));
		listaAnimais.add(new Animal(9L, "Coelho"));
		listaAnimais.add(new Animal(4L, "Cachorro"));
		listaAnimais.add(new Animal(8L, "Gato"));
		listaAnimais.add(new Animal(7L, "Girafa"));
		listaAnimais.add(new Animal(1L, "Gato"));

		System.out.println("Lista Original");
		listaAnimais.forEach(System.out::println);

		System.out.println("  ");
		
		//listaAnimais.sort(new ComparadorId());
		listaAnimais.sort((o1, o2) -> o1.getId().compareTo(o2.getId())); //Direto
		System.out.println("Lista ordenada por Id: ");
		listaAnimais.forEach(System.out::println);
	}

}
