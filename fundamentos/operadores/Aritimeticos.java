package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {
		
		// Pode criar a opera��o direto no  System.out.println
	
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 3.3;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 3;
		int b = 8;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		// Nesse resultado, a divis�o � 0 porque os valores admitidos s�o inteiros. 
		
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		// Usando a convers�o (double) ou (float) ele entrega um resultado double ou float
		
		System.out.println(a % b);
		// O operador %, chamado de m�dulo entra o resto da divis�o
		
		System.out.println(x + y - a * b);
		// Sistema de preced�ncia � igual ao modelo matem�tico
	}

}
