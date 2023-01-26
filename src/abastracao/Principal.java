package abastracao;

public class Principal {

	public static void main(String[] args) {
		// Criar um objeto Joystick
		// Instanciar um objeto de Joystick
		//Joystick js1= new Joystick();
		Joystick js1= new Joystick("PS4", "Preto", 50);
		Joystick js2= new Joystick("PS5", "Branco", 100);
		
		/*
		js1.modelo="PS4";
		js1.setModelo("PS4")
		js1.cor="Preto";
		js1.setCor("Preto");
		js1.porcetagemBateria=50;
		js1.setPorcetagemBateria(50);
		*/
		
		//System.out.println(js1.modelo);
		//System.out.println(js1.getModelo());
		js1.visualizarInfoJoystick();
		//js1.conectar();
		//js1.recarregar();
		
		js2.visualizarInfoJoystick();
		//js2.conectar();
		//js2.recarregar();
		
	}

}
 