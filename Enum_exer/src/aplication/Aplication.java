package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Aplication {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		//instanciando o SimpleDateFormat para pega a data digitada nesse formato
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = entrada.nextLine();
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String workerName = entrada.nextLine();
		
		System.out.print("Level [JUNIOR | MID_LEVEL | SENIOR]: ");
		String workerLevel = entrada.nextLine();
		
		System.out.print("Base salary: ");
		double workerSalary = entrada.nextDouble();
		
		//instanciando o construtor com os valores digitados
		//WorkerLevel.valueOf(workerLevel) --> tem que ser declarada assim pois é um enum, o usuario vai digitar mesma coisa que esta no enum
		//new Department (departmentName) --> a variavel digitada tem que passar assim pois a classe worker esta referenciando a classe Department
		Worker  worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department (departmentName));

//======================================================================================
		//loop for para cadastro
		System.out.print("How many contracts to this worker?: ");
		int n = entrada.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(entrada.next());
			System.out.print("Value per hour: ");
			double valuePerHour = entrada.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = entrada.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
//======================================================================================
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = entrada.next();
		
		//pegando a string digitada e associando no int month e year
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: ");
		System.out.println("Department: ");
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		entrada.close();
	}

}
