package programa_empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import empregados.Empregado;

public class Programa_empregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.print("Quantos funcionários serão cadastrados: ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println();
			System.out.println("Funcionario #" + i);

			System.out.print("ID: ");
			int id = entrada.nextInt();

			entrada.nextLine();
			System.out.print("Nome: ");
			String nome = entrada.nextLine();

			System.out.print("salario: ");
			double salario = entrada.nextDouble();

			// adicionando os campos digitados na lista
			list.add(new Empregado(id, nome, salario));

		}

		System.out.println();

		System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
		int id = entrada.nextInt();

		// percorrendo a lista para trazer o id digitado que esta na lista
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("Esse id nao existe!");
			System.out.println();
		} else {
			System.out.print("Digite a porcentagem que ira adicionar: ");
			double porcen = entrada.nextDouble();
			emp.adicionandoSalario(porcen);
		}

		for (Empregado empre : list) {
			System.out.println("Lista dos empregados");
			System.out.println(empre);
		}

		entrada.close();
	}

}
