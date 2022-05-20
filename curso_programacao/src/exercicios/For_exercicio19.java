package exercicios;

import java.util.Scanner;

public class For_exercicio19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		
		int in = 0;
		int out = 0;
		
		System.out.println("Digite um valor inteiro: ");
		n = entrada.nextInt();
				
		for(int i = 0; i<n;i++) {
			System.out.println("Digite um valor inteiro: ");
			n = entrada.nextInt();
			if(n >= 0 && n <=20) {
				in = in +1;
			}else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		entrada.close();
	}

}
