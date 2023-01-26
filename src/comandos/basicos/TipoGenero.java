package comandos.basicos;
import java.util.Scanner;
public class TipoGenero {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		char sexo;
		
		System.out.println("Qual é o seu sexo?");
		sexo=ler.next().charAt(0);
		if(sexo =='M'|| sexo =='m') {
		System.out.println("Individuo do sexo Masculino!");
		}
		else if (sexo =='F'|| sexo =='f') {
		System.out.println("Individuo do sexo Feminino!");
		}
		else {
		System.out.println("Tipo de genero nao encotrado!");
		}
	}

}
