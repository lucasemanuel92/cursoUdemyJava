package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // Convers�o implicita
		System.out.println(a);
		
		//float b = 1.0F; Solu��o padr�o
		
		//Fazendo um CAST, note que existe poss�vel perda de informa��o por estar saindo de um maior para um menor.
		float b = (float) 1.12345456184615; // Convers�o explicita
		System.out.println(b);
		
		int c = 5;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}

}
