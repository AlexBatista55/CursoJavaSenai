package comandos.basicos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class MaioreMenor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		int i;
		System.out.println("Escolha 5 numeros: ");
		for(i=1;i<=5;i++) {
			numeros.add(ler.nextInt());
		}
		System.out.println(Collections.max(numeros));
		System.out.println(Collections.min(numeros));
		ler.close();
	}

}
