import java.util.Scanner;

public class Aula45_while {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n,soma = 0;
		System.out.println("Se digitar 0 ele para e soma todos os numeros");
		
		System.out.print("Digite um numero:");
		n = entrada.nextInt();
		
		//while so reproduz quando for verdadeiro, se for falsa ele sai do loop
		while(n != 0) {
			soma = soma + n;
			System.out.print("Digite um numero:");
			n = entrada.nextInt();
			
		}
		System.out.println(soma);
		
		entrada.close();
	}

}
