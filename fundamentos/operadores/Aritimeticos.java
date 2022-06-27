package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {
		
		// Pode criar a operação direto no  System.out.println
	
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
		// Nesse resultado, a divisão é 0 porque os valores admitidos são inteiros. 
		
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		// Usando a conversão (double) ou (float) ele entrega um resultado double ou float
		
		System.out.println(a % b);
		// O operador %, chamado de módulo entra o resto da divisão
		
		System.out.println(x + y - a * b);
		// Sistema de precedência é igual ao modelo matemático
	}

}
