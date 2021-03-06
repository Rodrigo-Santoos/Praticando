package empregados;

public class Empregado {

	private Integer id;
	private String nome;
	private Double salario;

//Constructor
	public Empregado() {

	}

	public Empregado(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

//Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

//Metodos

	public double adicionandoSalario(double porcentagem) {
		return salario += salario * porcentagem / 100;
	}

	public String toString() {
		return id + ", " + nome + ", " + salario;
	}

}
