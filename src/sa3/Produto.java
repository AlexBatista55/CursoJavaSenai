package sa3;

public class Produto extends Venda {
	//Atributos
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	//Construtores
	public Produto() {
		
	};

	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	};
	
	//Metódo
	public void verificarEstoque() {
		if (quantidadeEstoque>0) {
		System.out.println(true);
		}
		else {
		System.out.println(false);
		}
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
	
}
