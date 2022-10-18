package strategy.comparator;

public class Animal {
	private Long id;
	private String nome;
	
	public Animal(Long id, String nome) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	//ctrl + 3 tost
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}
	
	
}

