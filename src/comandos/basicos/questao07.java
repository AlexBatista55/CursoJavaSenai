package comandos.basicos;
import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		Scanner reed = new Scanner(System.in);
		int n, maior =0, menor = 0;
		for (int i=0; i < 10 ; i=i+1)  {
					System.out.println("Digite N"+(i+1)+":");
					n=reed.nextInt();
					if(i==0) {
						maior = n;
						menor = n;
					}
					if(n>maior) {
						maior=n;
				}
			
					if(n<menor) {
						menor = n;
			}
		}
      System.out.println( "Maior;"+maior+   "Menor:"+ menor);
      reed.close();
      }
  }
