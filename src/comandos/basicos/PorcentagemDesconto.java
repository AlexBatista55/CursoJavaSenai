package comandos.basicos;
import java.util.Scanner;
public class PorcentagemDesconto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tipoCliente,quantidade,i;
		double porcentFuncionario, porcentVIP, preço, total;
		String Cliente;
		System.out.println("Qual a quantidade de produtos?");
		quantidade=ler.nextInt();
		total=0;
		for(i=0;i<quantidade;i++) {
			System.out.println("Digite o preco do "+(i+1)+" produto R$:");
			preço=ler.nextDouble();
			total=preço+total;
		}
		porcentFuncionario= total-(total*0.1);
		porcentVIP= total-(total*0.05);
		
		System.out.println("Qual o codigo do cliente?");
		System.out.println("Digite (1) Cliente, (2) Funcionario, (3) Cliente VIP :");
		tipoCliente=ler.nextInt();
		if(tipoCliente==1) {
			Cliente="Cliente Normal";
			System.out.println("Categoria: "+Cliente+":O preco total da compra eh de R$"+total);
		}
		else if(tipoCliente==2) {
			Cliente="Funcionario";
			System.out.println("Categoria: "+Cliente+":O preco total da compra eh de R$"+porcentFuncionario);
		}
		else if(tipoCliente==3) {
			Cliente="Cliente Vip";
			System.out.println("Categoria: "+Cliente+":O preco total da compra eh de R$"+porcentVIP);
		}
		else {
			System.out.println("Codigo de cliente valido!Reinicie o programa.");
		};
	}

}
