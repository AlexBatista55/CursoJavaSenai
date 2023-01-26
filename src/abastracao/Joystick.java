package abastracao;

public class Joystick {
	//Atributos
	//variaveis Globais
	private String modelo, cor;
	private int porcetagemBateria;
	
	//Método especial - Método Construtor
	//Construtor Vazio
	public Joystick() {
	
	}
	
	//Construtor Completo
	//variaveis locais
	public Joystick(String modelo, String cor, int porcetagemBateria) {
	
		this.modelo = modelo;
		this.cor = cor;
		this.porcetagemBateria = porcetagemBateria;
	}
	
	//Getters e Setters
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPorcetagemBateria() {
		return porcetagemBateria;
	}

	public void setPorcetagemBateria(int porcetagemBateria) {
		this.porcetagemBateria = porcetagemBateria;
	}

	//Método = Função ou Procedimento
	//Visibilidade e retorno
	public void visualizarInfoJoystick() {
		System.out.println("Modelo: "+ modelo + 
				"\nCor: "+ cor +
				"\nPorcetagem da Bateria: "+ porcetagemBateria);
	}
	
	public void conectar() {
		System.out.println("joystick conectado ao video game!");
	}
	
	public void recarregar() {
		System.out.println("Joystick carregando...");
	}
}
