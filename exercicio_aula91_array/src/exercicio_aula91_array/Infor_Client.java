package exercicio_aula91_array;

public class Infor_Client {

	private String name;
	private String email;

//constructor
	public Infor_Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

//Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
//Metodo
	public String toString() {
		return name + " , " + email;
	}
}
