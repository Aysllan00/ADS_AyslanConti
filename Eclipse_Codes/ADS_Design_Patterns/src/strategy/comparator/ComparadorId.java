package strategy.comparator;

import java.util.Comparator;

public class ComparadorId implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}
