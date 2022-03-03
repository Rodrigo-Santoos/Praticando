import java.util.Scanner;

public class Aula40_condicional_ternaria {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		//Seria como fosse o if e else, exemplo:
		if(preco < 20.0) {
			desconto = preco * 0.1;
			
		}else {
			desconto = preco * 0.05;
			
		}
		
		System.out.println(desconto);
		
		
		
		
		entrada.close();
	}

}
