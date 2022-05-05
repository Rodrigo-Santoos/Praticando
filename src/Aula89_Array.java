import java.util.Locale;
import java.util.Scanner;

public class Aula89_Array {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int n;

		System.out.print("Digite quantos pessoas ira adicionar: ");
		n = entrada.nextInt();

		double[] vect = new double[n];

		// loop for para adicionar as altura das pessoas
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o peso: ");
			vect[i] = entrada.nextDouble();
		}

		double sum = 0;

		// loop for para soma todas as alturas das pessoas
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("Average Heigth: %.2f", avg);

		entrada.close();
	}

}
