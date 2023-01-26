package sa3;

import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
	
	Scanner ler = new Scanner(System.in);
	//Atributos
	ArrayList<String> produtos = new ArrayList<>();
	
	private double vlrTotal;
	private int quant;
	
	
	//Construtores
	public Venda() {
	
	}

	public Venda(ArrayList<String> produtos, double vlrTotal,int quant) {
		this.produtos = produtos;
		this.vlrTotal = vlrTotal;
		this.quant = quant;
	}
	

	public Venda(Scanner ler) {
		this.ler = ler;
	}

	//Metódo
	public void adicionarItemVenda(String produtos,double preco) {
		System.out.println("Adicione um produto:");
		this.produtos.add(ler.next());
		System.out.println("Informe a quantidade: ");
		quant=ler.nextInt();
		System.out.println("Informe o preço:R$");
		preco=ler.nextDouble();
		vlrTotal=(quant*preco)+vlrTotal;
		System.out.println("Quant. "+ quant +"| Prod. "+produtos +"| Total R$" + vlrTotal);
	};
	
	public void vizualizarVenda() {
		System.out.println(produtos);
	};
	
	public void concluirVenda(int pag) {
		
	};

	//Getters e Setters
	public ArrayList<String> getProdutos() {
		return produtos;
	}


	public void setProdutos(ArrayList<String> produtos) {
		this.produtos = produtos;
	}


	public double getVlrTotal() {
		return vlrTotal;
	}


	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	
	
	
	
}
