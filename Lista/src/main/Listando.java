package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listando {

	public static void main(String[] args) {

		// criando e instanciando a lista
		List<String> lista = new ArrayList<>();

		lista.add("Rodrigo");// 0
		lista.add("Adriana");// 1
		lista.add("Roberto");// 2
		lista.add("Danilo");// 3
		lista.add("Kelly");// 4
		lista.add("Lidinha");// 5
		lista.add("Branquinho");// 6
		lista.add("Ana Clara");// 7

		System.out.println("----------------------------------------------------------");

		// adicionado o valor no campo desejado
		lista.add(5, "Robert");

		System.out.println("O robert foi adicionado na 5 posiçao");
		System.out.println();
		// tranzendo todos na lista ordernada com o for each
		for (String x : lista) {
			System.out.println(x);
		}
//--------------------------------------------------------------------------------------------------------------------------		
		System.out.println("----------------------------------------------------------");

		// monstrando o tamanho da lista
		System.out.println("A lista tem o tamanho de " + lista.size());
// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");

		// tranzendo todos na lista ordernada com o for each
		System.out.println("Trazendo todas as informaçoes na posiçoes");
		System.out.println();
		for (String x : lista) {
			System.out.println(x);
		}
// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");

		// removendo o nome da lista
		lista.remove("Rodrigo");

		// tranzendo todos na lista ordernada com o for each
		System.out.println("O Rodrigo foi removido aqui");
		System.out.println();
		for (String x : lista) {
			System.out.println(x);
		}
// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");

// removendo todos que possuem a mesma inicial do nome ex: Rodrigo e Roberto
		lista.removeIf(x -> x.charAt(0) == 'R');

		System.out.println("Todos quen possuem a primeira letra inicial [R] foi removido");
		System.out.println();
		for (String x : lista) {
			System.out.println(x);
		}
// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");

		// removendo a pela posiçao
		lista.remove(1);

		System.out.println("A Adriana na posiçao 1 foi removido");
		System.out.println();
		for (String x : lista) {
			System.out.println(x);
		}
// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");

		// trazendo a posiçao do elemento
		System.out.println("A Adriana esta na posiçao: " + lista.indexOf("Adriana"));

// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");
		// filtrando para trazer os nomes que possuem a mesma inicial
		List<String> filtro = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		System.out.println("Trazendo os Nomes com a inicial [A] com o filtro da lista");
		System.out.println();
		for (String x : filtro) {
			System.out.println(x);
		}

// --------------------------------------------------------------------------------------------------------------------------
		System.out.println("----------------------------------------------------------");
		// trazendo a primeira posiçao que tem a String [A]
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println("Trazendo a primeira posiçao que comeca com a inicial [A]");
		System.out.println(name);


	}

}
