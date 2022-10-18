package strategy.comparator;

import java.util.Comparator;

public class ComparadorNome implements Comparator<Animal> {

	//Classe fora do escopo, podendo ter varias logicas para fazer a ordenação
	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		//Compara o nome (String) por ordem alfabetica
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
