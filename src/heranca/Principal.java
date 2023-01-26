package heranca;

public class Principal {

	public static void main(String[] args) {
		JogoTabuleiro jogoTabuleiro = new JogoTabuleiro();
		JogoCartas jogoCartas = new JogoCartas();
		JogodDados jogoDados = new JogodDados();
		
		//Atributos atraves de Herança
		jogoTabuleiro.setNome("Catan");
		jogoTabuleiro.setDistribuidores("Devir");
		jogoTabuleiro.setNrJogadores(4);
		jogoTabuleiro.setFaixaEtaria(12);
		jogoTabuleiro.setTamanhoTabuleiro("40x40");
		jogoTabuleiro.setQuantPecas(35);
		
		//jogoTabuleiro.infoJogo();
		//jogoTabuleiro.jogar();
		//------------------------------------------------------------
		jogoCartas.setNome("Taco Gato Cabra Queijo Pizza");
		jogoCartas.setDistribuidores("Papper games");
		jogoCartas.setNrJogadores(8);
		jogoCartas.setFaixaEtaria(6);
		jogoCartas.setTamanhoCartas("Padrão");
		jogoCartas.setQuantCartas(50);
		//------------------------------------------------------------
		jogoDados.setNome("Bang! Dice Games");
		jogoDados.setDistribuidores("Galápagos Jogos");
		jogoDados.setNrJogadores(8);
		jogoDados.setFaixaEtaria(12);
		jogoDados.setTipoDados("D6");
		jogoDados.setQuantDados(8);
		//------------------------------------------------------------
		jogoTabuleiro.infoJogo();
		jogoCartas.infoJogo();
		jogoDados.infoJogo();
		
		//--------------------------------------------------------------
		//Atributos da classe  JogoTabuleiro
		//jogoTabuleiro.setTamanhoTabuleiro("40x40");
		//jogoTabuleiro.setQuantPecas(35);
		
		//jogoTabuleiro.setupTabuleiro();
		//jogoTabuleiro.moverPeca();
	}

}
