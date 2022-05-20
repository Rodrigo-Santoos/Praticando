package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee_exer;

public class Exercicio_OB_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		Employee_exer em = new Employee_exer();
		
		System.out.print("Name: ");
		em.name = entrada.nextLine();
		
		System.out.print("Gross salary: ");
		em.grossSalary = entrada.nextDouble();
		
		System.out.print("Tax: ");
		em.tax = entrada.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + em.name + "," + " $ " + em.netsalary());
//--------------------------------------------------------------------------------------------
		System.out.println();
		System.out.print("Which percentage to increase salary?: ");
		double in = entrada.nextDouble();
		em.increaseSalary(in);
//--------------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("Update data: " + em.name + "," + " $ " + em.netsalary());
				
		entrada.close();
	}

}
