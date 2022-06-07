package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// associacao com a classe Department
	private Department department;

	// associacao com a classe HourContract
	//instanciando a lista HourConstract
	private List<HourContract> contracts = new ArrayList<>();
	
//========================================================================================================
//constructor
	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
//========================================================================================================
//getters e setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//nao pode deixar a lista ser trocada por isso esta comentada, so pode adicionar e delatar, mas nao pode troca a lista
//	public void setContracts(List<HourContract> contracts) {
//		this.contracts = contracts;
//	}
	
//========================================================================================================	
//metodos
	
	//adicionando o contrato na lista contracts 
	public void addContract(HourContract addContract) {
		contracts.add(addContract);
	}
	
	//removendo o contrato na lista contracts 
	public void removeConstract(HourContract removeConstract) {
		contracts.remove(removeConstract);
	}
	
	//calculo de ganho por mes e ano
	public Double income(int year, int month) {
		return 
	}
	
}
