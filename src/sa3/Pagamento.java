package sa3;

public class Pagamento extends Venda {
	//Atributos
	 int tipoPagamento;
	 
	 //Construtores
	public Pagamento() {

	}
	public Pagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	//Metodos
	public void selecionarTipoPagmento(int pag) {
		if (pag==1) {
			System.out.println("Pagemento em Dinheiro!");
		}
		else if(pag==2) {
			System.out.println("Pagamento em Cheque!");
		}
		else if(pag==3){
			System.out.println("Pagamento no Cartão!");
		}
	}
	
	public void realizarPagamento(int Pagamento) {
		
	}
	
	//Getters e Setters
	public int getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	
	 
}
