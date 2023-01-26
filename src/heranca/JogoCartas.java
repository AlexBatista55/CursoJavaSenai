package heranca;

public class JogoCartas extends Jogo{
	//Atrtibutos
	private String tamanhoCartas;
	private int quantCartas;
	
	//Contrutores
	public JogoCartas() {
		
	}

	public JogoCartas(String tamanhoCartas, int quantCartas) {
		this.tamanhoCartas = tamanhoCartas;
		this.quantCartas = quantCartas;
	}
	//Metodos
	public void comprarCartas() {
		System.out.println("Carta comprada!");
	}
	public void descartarCartas() {
		System.out.println("Carta descartada!");
	}
	public void jogarCartas() {
		System.out.println("Carta jogada!");
	}
	 
	//Getters e Setters
	public String getTamanhoCartas() {
		return tamanhoCartas;
	}

	public void setTamanhoCartas(String tamanhoCartas) {
		this.tamanhoCartas = tamanhoCartas;
	}

	public int getQuantCartas() {
		return quantCartas;
	}

	public void setQuantCartas(int quantCartas) {
		this.quantCartas = quantCartas;
	}

	@Override
	public void infoJogo() {
		System.out.println("Nome: "+nome +
				"\nDistribuidora :"+ distribuidores +
				"\nNumero de jogadores: "+ nrJogadores + 
				"\nFaixa Etaria: "+ faixaEtaria +
				"\nTamanho Cartas: "+ tamanhoCartas +
				"\nQuatidade Cartas: "+ quantCartas);
		
	}
	
	
	
}
