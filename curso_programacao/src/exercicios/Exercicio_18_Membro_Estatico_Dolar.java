package exercicios;

import java.util.Locale;
import java.util.Scanner;

import ultil.CurrencyConverter;

public class Exercicio_18_Membro_Estatico_Dolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double dolar,manyDollar,totalReais;
		double acreIOF,acre;
		
		System.out.print("Whats is the dollar price? ");
		dolar = entrada.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		manyDollar = entrada.nextDouble();
		
		totalReais = CurrencyConverter.calcDolar(manyDollar, dolar) ;
		
		acreIOF = CurrencyConverter.calcIOF(totalReais);
		
		acre = acreIOF + totalReais;
		
		System.out.printf("Amount to be paind in reais = %.2f%n " , acre);
		
		entrada.close();
		
	}

}
