import java.util.Scanner;

import entities.Product_Array;

public class Aula90_Array02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite quantos produtos ira adicionar: ");
		int n = entrada.nextInt();
		
		Product_Array [] vect = new Product_Array[n];
		
		for(int i =0 ; i < vect.length ; i++) {
			entrada.nextLine();
			
			System.out.print("Digite o nome do produto: ");
			String name = entrada.nextLine();
			
			System.out.print("Digite o preço do produto: ");
			int price = entrada.nextInt();
			
			vect [i] = new Product_Array(name, price);
		}
		
		double soma = 0.0;
		
		for(int i = 0 ; i<vect.length ; i++) {
			 soma += vect[i].getPrice();
		}

		double avg = soma / vect.length;
		
		System.out.printf("Avare Price %.2f%n" , avg);
		
		entrada.close();
	}

}
