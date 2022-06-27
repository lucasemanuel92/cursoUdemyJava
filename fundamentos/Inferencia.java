package fundamentos;

public class Inferencia {

	/*
	 *  Quando se define a variável como b, o JAVA define que essa variável é do tipo double,
	 *  então não é necessáriamente necessário definir o tipo da variável, mas todas as outras do mesmo tipo terão que 
	 *  ser do mesmo tipo (double, string, int).  
	 */
	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e Incialização da Variável
		System.out.println(a); // Uso da Variável
		
		// É possível colocar inteiros em variáveis double, mas não o contrário 
		a = 12; 
		System.out.println(a);
		
		var b = 4.3;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Texto diferente";
		System.out.println(c);
		// todas as variáveis usadas em c precisarão ser, necesssariamente do tipo String
		
		double d; // Variável Declarada
		d = 123.65; // Variável Inciada
		System.out.println(d); // Variável Usada
		
	}
	
}
