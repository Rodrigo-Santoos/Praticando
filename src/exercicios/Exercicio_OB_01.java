package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle_exer;

public class Exercicio_OB_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		Rectangle_exer retangulo = new Rectangle_exer();
		
		System.out.print("Enter rectangle width: ");
		retangulo.width = entrada.nextDouble();
		
		System.out.print("Enter rectangle height: ");
		retangulo.height = entrada.nextDouble();
		
		System.out.println("Area = "+ retangulo.area());
		
		System.out.println("Perimeter = " + retangulo.perimeter());
		
		System.out.println("Diagonal = " + retangulo.diagonal());
		
		entrada.close();
	}

}
