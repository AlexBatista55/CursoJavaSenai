package heranca;

public class JogoTabuleiro extends Jogo {
	//Atributos
	private String tamanhoTabuleiro;
	private int quantPecas;
	
	//Construtores
	public JogoTabuleiro() {
		
	}
	public JogoTabuleiro(String nome, String distribuidores, int nrJogadores, int faixaEtaria, String tamanhoTabuleiro,
			int quantPecas) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
		this.quantPecas = quantPecas;
	}
	
	//Metodos
	public void setupTabuleiro() {
		System.out.println("Tabuleiro Montado!");
	}
	public void moverPeca() {
		System.out.println("Peça movida!");
	}
	
	//Getters e Setters
	public String getTamanhoTabuleiro() {
		return tamanhoTabuleiro;
	}
	public void setTamanhoTabuleiro(String tamanhoTabuleiro) {
		this.tamanhoTabuleiro = tamanhoTabuleiro;
	}
	public int getQuantPecas() {
		return quantPecas;
	}
	public void setQuantPecas(int quantPecas) {
		this.quantPecas = quantPecas;
	}
	
	@Override //Anotação Java
	public void infoJogo() {
		System.out.println("Nome: "+nome +
				"\nDistribuidora :"+ distribuidores +
				"\nNumero de jogadores: "+ nrJogadores + 
				"\nFaixa Etaria: "+ faixaEtaria +
				"\nTamanho tabuleiro: "+ tamanhoTabuleiro +
				"\nQuatidade Peças: "+ quantPecas);
		
	}
	
	
}
