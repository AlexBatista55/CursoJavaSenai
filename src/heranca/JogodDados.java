package heranca;

public class JogodDados extends Jogo {
	//Atributos
	private String tipoDados;
	private int quantDados;
	
	//Construtores
	public JogodDados() {

	}
	public JogodDados(String tipoDados, int quantDados) {
	
		this.tipoDados = tipoDados;
		this.quantDados = quantDados;
	}
	
	//Metodos
	public void arremessarDados() {
		System.out.println("Dado Arremessado!");
	}
	
	//Getters e Setters
	public String getTipoDados() {
		return tipoDados;
	}
	public void setTipoDados(String tipoDados) {
		this.tipoDados = tipoDados;
	}
	public int getQuantDados() {
		return quantDados;
	}
	public void setQuantDados(int quantDados) {
		this.quantDados = quantDados;
	}
	
	@Override
	public void infoJogo() {
		System.out.println("Nome: "+nome +
				"\nDistribuidora :"+ distribuidores +
				"\nNumero de jogadores: "+ nrJogadores + 
				"\nFaixa Etaria: "+ faixaEtaria +
				"\nTipo Dados: "+ tipoDados +
				"\nQuatidade Dados: "+ quantDados);
		
		
	}
	
	
	

}
