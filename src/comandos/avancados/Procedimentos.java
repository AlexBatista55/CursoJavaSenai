package comandos.avancados;

public class Procedimentos {
	static double num1, num2, resposta;
	
	//Procedimento sem paramentro
	public static void soma() {
		resposta = num1 + num2;
	}
	//Procedimento com paramentro
	public static void subtracao(double n1, double n2) {
		resposta = n1 - n2;
	}
	//funcao sem parametro
	public static double multiplicacao() {
		return num1 * num2;
	}
	//funcao sem parametro
	public static double divisao(double n1, double n2) {
		return n1 / n2;
	}
	public static void main(String[] args) {
		num1= 10;
		num2 = 5;
		soma();
		System.out.println(resposta);
		subtracao(num1,num2);
		System.out.println(resposta);
		System.out.println(multiplicacao());
		System.out.println(divisao(num1,num2));
	}

}
