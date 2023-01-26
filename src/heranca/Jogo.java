package heranca;

public abstract class Jogo {
	//Atributos
	protected String nome;
	protected String distribuidores;
	protected int nrJogadores;
	protected int faixaEtaria;
	
	//Construtores
	
	public Jogo() {

	}
	public Jogo(String nome, String distribuidores, int nrJogadores, int faixaEtaria) {
		this.nome = nome;
		this.distribuidores = distribuidores;
		this.nrJogadores = nrJogadores;
		this.faixaEtaria = faixaEtaria;
	}
	
	//Metodos
	/*public void infoJogo() {
		System.out.println("Nome: "+nome +
				"\nDistribuidora :"+ distribuidores +
				"\nNumero de jogadores: "+ nrJogadores + 
				"\nFaixa Etaria: "+ faixaEtaria);
	}*/
	
	public abstract void infoJogo();
	
	public void jogar() {
		System.out.println("Você está jogando!");
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDistribuidores() {
		return distribuidores;
	}

	public void setDistribuidores(String distribuidores) {
		this.distribuidores = distribuidores;
	}

	public int getNrJogadores() {
		return nrJogadores;
	}

	public void setNrJogadores(int nrJogadores) {
		this.nrJogadores = nrJogadores;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	
	
}

