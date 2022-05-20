package entidades;

public class Cadastro {

	private String nome;
	private String email;

//constructor
	public Cadastro(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

//Getter e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
//metodo
	public String toString() {
		return nome + ", " + email;
	}
}
