package comandos.basicos;

public class CondicionalEOU {

	public static void main(String[] args) {
		double media;
		int frequencia;
		String estado;
		media = 8;
		frequencia = 100;
		estado = "SC";
	   if(estado.equals("SC")) {
			System.out.println("Catarinense");
		}
		
		if(media>=7 && frequencia >=75) {
			System.out.println("Aluno aprovado!");
		}

	}

}
