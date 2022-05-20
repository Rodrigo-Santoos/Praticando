import java.util.Scanner;

public class Aula38 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int min;
		
		int pago = 50;
		
		System.out.print("Digite quantos minutos ficou na linha: ");
		min = entrada.nextInt();
		
		if(min <= 100) {
			System.out.print("O valor a Pagar é R$ " + pago);
			
		}else {
			pago = pago + (min - 100) * 2 ;
			System.out.print("O valor a Pagar é R$ " + pago);
			
		}
		
		
		entrada.close();
	}

}
