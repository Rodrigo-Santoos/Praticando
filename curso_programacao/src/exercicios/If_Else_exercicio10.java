package exercicios;

import java.util.Scanner;

public class If_Else_exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double horasIni, horasFinal, duracao;
		
		System.out.print("Digite o horario que inicia o jogo: ");
		horasIni = entrada.nextDouble();
		
		System.out.println("Digite o horario que terminou o  jogo: ");
		horasFinal = entrada.nextDouble();
		
		if(horasIni < horasFinal) {
			duracao = horasIni - horasFinal;
		} else {
			duracao = 24 - horasIni + horasFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " Horas");
		
		
		
		
		entrada.close();
	}

}
