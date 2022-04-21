package aplicativo;

import java.util.Scanner;

import entities.Produto;

public class Programa_Estoque {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Digite as informa�oes do produto!");
		
		System.out.print("Nome: ");
		produto.nome = entrada.next();
		
		System.out.print("Pre�o: ");
		produto.preco = entrada.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = entrada.nextInt();
//--------------------------------------------------------------------------------------------
		System.out.println();
		System.out.println("Dados Adcionados: "+produto.ToString());
//--------------------------------------------------------------------------------------------		
		System.out.println();
		System.out.print("Digite o numero de intens que ira adicionar no estoque: ");
		int adquantidade = entrada.nextInt();
		produto.adicionarProdutos(adquantidade);
//--------------------------------------------------------------------------------------------		
		System.out.println();
		System.out.println("Atualiza�ao nos Dados: " + produto.ToString());
//--------------------------------------------------------------------------------------------		
		System.out.println();
		System.out.print("Digite o numero de intens que ira adicionar no estoque: ");
		int retiquantidade = entrada.nextInt();
		produto.removerProdutos(retiquantidade);
//--------------------------------------------------------------------------------------------		
		System.out.println();
		System.out.println("Atualiza�ao nos Dados: " + produto.ToString());
		
		entrada.close();
	}

}
