import java.util.Scanner;

public class Aula39_switch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String dia;
		
		int num;
		
		System.out.print("Digite um numero de 1 a 7: ");
		num = entrada.nextInt();
		
		switch (num) {
		case 1: 
			dia = "Domingo";
			break;
		case 2:
			dia  = "Segunda-feiria";
			break;
		case 3:
			dia  = "Terça-feiria";
			break;
		case 4:
			dia  = "Quarta-feiria";
			break;
		case 5:
			dia  = "Quinta-feiria";
			break;
		case 6:
			dia  = "Sexta-feiria";
			break;
		case 7:
			dia  = "Sabado";
			break;
		default:
			dia = "Digite de 1 a 7";
		}
		
		System.out.println(dia);
		
		entrada.close();
}

}

