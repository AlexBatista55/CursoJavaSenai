package comandos.basicos;
import java.util.Scanner;
public class SituacaoAluno {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	String nome;
	double nota1, nota2, nota3,media;
	System.out.println("Digite o nome do Aluno:");
	nome=ler.nextLine();
	System.out.println("Digite a primeira nota do aluno "+nome+":");
	nota1= ler.nextDouble();
	System.out.println("Digite a segunda nota do aluno "+nome+":");
	nota2= ler.nextDouble();
	System.out.println("Digite a terceira e ultima nota do aluno "+nome+":");
	nota3= ler.nextDouble();
	
	media= (nota1+nota2+nota3)/3;
	System.out.println("A media do aluno "+nome+" eh de:"+media);
	if(media>= 7) {
		System.out.println("O aluno "+nome+" esta Aprovado!");
	}
	else if(media<7 && media>5) {
		System.out.println("O aluno "+nome+" esta em recuperacao!");
	}
	else {
		System.out.println("O aluno "+nome+" esta Reprovado!");
	}
	}

}
