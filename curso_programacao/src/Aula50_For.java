import java.util.Scanner;

public class Aula50_For {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n = 2;
		int soma = 0;

//		System.out.print("Digite quantos valor quer somar: ");
//		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {
			int x = 0;
			System.out.print("Digite o valor para somar");
			x = entrada.nextInt();
			soma = soma + x;

		}

		System.out.println(soma);

		entrada.close();
	}

}
