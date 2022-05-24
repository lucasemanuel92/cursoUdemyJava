package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean TV50 = trabalho1 && trabalho2;
		boolean TV32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		
		System.out.println("Comprou TV de 50\"? " + TV50);
		System.out.println("Comprou TV de 32\"? " + TV32);
		System.out.println("Comprou sorvete? " + sorvete);
		System.out.println("Mais saudável? " + !sorvete); // Operador unário
	}

}
