package comandos.basicos;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, i;
		System.out.println("Escolha um numero: ");
		num=ler.nextInt();
		for (i=0; i<=num; i++) {
			System.out.println(i);
		}

	}

}