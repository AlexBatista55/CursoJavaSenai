package comandos.basicos;
import java.util.Scanner;
public class CustoCarroNovo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double custoCarroConsumidor,custoCarroFabrica,porcDistribuidor,porcImposto;
		
		porcImposto=45;
		porcDistribuidor=28;
				
		System.out.println("Digite o valor do carro de fabrica:");
		custoCarroFabrica = ler.nextDouble();
		
		custoCarroConsumidor = (custoCarroFabrica+((custoCarroFabrica*porcDistribuidor)/100)+((custoCarroFabrica*porcImposto)/100));
		
		System.out.println("O valor Final para o consumidor com todos os impostos eh de R$"+custoCarroConsumidor);
}
}