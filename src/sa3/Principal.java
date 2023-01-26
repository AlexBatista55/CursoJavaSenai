package sa3;

import java.util.Scanner;

public class Principal {	

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto prod = new Produto();
		Pagamento pag = new Pagamento();
		
		prod.setNome("Detergente");
		prod.setPreco(2.50);
		prod.setQuantidadeEstoque(10);
		//-------------------------------------
		/*prod.setNome("Arroz 1kg");
		prod.setPreco(3.50);
		prod.setQuantidadeEstoque(15);
		//-------------------------------------
		prod.setNome("Feijão 1kg");
		prod.setPreco(4.50);
		prod.setQuantidadeEstoque(20);*/
		
		prod.adicionarItemVenda(prod.getNome(),prod.getPreco());
		System.out.println("Informe o tipo de pagamento: 1- Dinheiro \n2- Cheque \n3- Cartão");
		pag.tipoPagamento=ler.nextInt();
		pag.setTipoPagamento(pag.tipoPagamento);
		pag.concluirVenda(pag.tipoPagamento);
		
	}
}