package entities;

public class Employee_exer {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netsalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage /100.0;
	}
	
}
