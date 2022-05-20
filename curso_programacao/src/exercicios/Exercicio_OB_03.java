package exercicios;

import java.util.Scanner;

import entities.Student_exer;

public class Exercicio_OB_03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Student_exer student = new Student_exer();
		
		System.out.print("Name: ");
		student.nome = entrada.nextLine();
		
		System.out.print("Nota 1: ");
		student.nota1 = entrada.nextDouble();
		
		System.out.print("Nota 2: ");
		student.nota2 = entrada.nextDouble();
		
		System.out.print("Nota 3: ");
		student.nota3 = entrada.nextDouble();
				
		System.out.println("FINAL GRADE = " + student.finalMedia());
		
		if(student.finalMedia()< 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING "+ student.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		entrada.close();
	}

}
