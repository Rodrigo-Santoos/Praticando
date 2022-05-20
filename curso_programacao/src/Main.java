import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		//setando o separador para os estados unidos
		Locale.setDefault(Locale.US);

		double x = 10.7500;
		//printf para formatar os numeros flutuantes
		System.out.printf("%.2f",x);
	}

}
