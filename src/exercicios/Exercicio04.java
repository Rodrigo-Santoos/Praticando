package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nuFun;
		
		double horasTra, valorTra, salario;
		
		System.out.print("Digite o seu ID: ");
		nuFun = entrada.nextInt();
		
		System.out.print("Digite o horario de horas trabalhada: ");
		horasTra = entrada.nextDouble();
		
		System.out.print("Digite o valor que ganha por Horas Trabalhada: ");
		valorTra = entrada.nextDouble();
		
		salario = valorTra * horasTra;
		
		System.out.println("Number= " + nuFun);
		
		System.out.printf("Salary= %.2f" , salario);
		
		entrada.close();
	}
}
