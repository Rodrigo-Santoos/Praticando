package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

//Constructor
	public Employee() {

	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//Getters e Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

//Metodos
	public String toString() {
		return id + ", " + name + ", " + salary;
	}

	// almento de salario por porcentagem
	public Double salaryAdd(Double porce) {
		return salary += salary * porce / 100;
	}

}
