package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	//metodo do total do valor do estoque
	public double totalValorEstoque() {
		double total = preco * quantidade;
		return total;
	}
	//metodo de adicionar produto
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	//metodo de remover produto
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	//Metodo de mostrar na tela
	public String ToString() {
		return nome 
				+", $ "
				+ String.format("%.2f", preco)
				+", "
				+ quantidade
				+ " unidades, Total: $ "
				+ totalValorEstoque() ;
	}

}
