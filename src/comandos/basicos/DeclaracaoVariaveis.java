package comandos.basicos;
import java.util.Scanner;
public class DeclaracaoVariaveis {
	//importação da biblioteca Scanner

	public static void main(String[] args) {
		// declaração de variaveis
		// tipos primitivos(variavel)
		Scanner ler = new Scanner(System.in);
		int idade;
		double nota1, nota2, media;
		char sexo;

		// tipos nao primitivos(objeto)
		String nome;
		
		System.out.println("Qual é o nome?");
		nome = ler.nextLine();
		System.out.println("Qual a sua idade?");
		idade = ler.nextInt();
		System.out.println("Qual é a primeira nota?");
		nota1= ler.nextDouble();
		nota2= 5;
		media = (nota1+nota2)/2;
		System.out.println("Nome: "+ nome + "\nIdade: " + idade +" anos \nMedia: " +  media );
				
	}

}
