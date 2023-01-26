package comandos.basicos;
import java.util.Scanner;
public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valorHora,horasTrabalhadas,salario;
		int dias;
		
		System.out.println("Qual o valor que voce recebe por hora?");
		valorHora = ler.nextDouble();
		System.out.println("Quantas horas voce trabalha por dia?");
		horasTrabalhadas = ler.nextDouble();
		System.out.println("Quantos dias no mes voce trabalhou?");
		dias= ler.nextInt();
		
		salario = (valorHora*horasTrabalhadas)*dias;
		
		System.out.println("Seu salario deste mes sera de R$"+salario);
	}
	
}
