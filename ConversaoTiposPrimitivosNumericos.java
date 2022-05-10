package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // Conversão implicita
		System.out.println(a);
		
		//float b = 1.0F; Solução padrão
		
		//Fazendo um CAST, note que existe possível perda de informação por estar saindo de um maior para um menor.
		float b = (float) 1.12345456184615; // Conversão explicita
		System.out.println(b);
		
		int c = 5;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}

}
