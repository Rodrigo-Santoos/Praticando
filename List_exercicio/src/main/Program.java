package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		// instanciando a classe Employee na lista
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?: ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Employoee #" + i);

			System.out.print("id: ");
			int id = entrada.nextInt();

			entrada.nextLine();
			System.out.print("Name: ");
			String name = entrada.nextLine();

			System.out.print("Salary: ");
			double salary = entrada.nextDouble();

			// adicionando na lista
			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = entrada.nextInt();

//-------------------------------------------------------------------------------------------------------------------
		//Essa parte é como usaria se eu usa-se o metodo que percorre a lista para pega o id
		
		/*Integer posi = positionId(list, id);
		  
		// verficaçao se a id existe
		if (posi == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			double por = entrada.nextDouble();
			em.salaryAdd(por);

			System.out.println();
		}*/
//-------------------------------------------------------------------------------------------------------------------
		
		// filtragem na lista[Employee] para pegar o id em uma so linha
		Employee em = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		// verficaçao se a id existe
		if (em == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			double por = entrada.nextDouble();
			em.salaryAdd(por);

			System.out.println();
		}

		// imprimindo tudo na lista com forEach
		System.out.println("List Emplyee");
		for (Employee x : list) {
			System.out.println(x);
		}

		entrada.close();
	}

	// metodo para verifica se o id esta na lista
	public static Integer positionId(List<Employee> list, int id) {
		// percorrendo a lista para encontrar o id digitado
		for (int i = 0; i < list.size(); i++) {
			// pegando o id digitado
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}

}
