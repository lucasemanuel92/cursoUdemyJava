package fundamentos;

public class Inferencia {

	/*
	 *  Quando se define a vari�vel como b, o JAVA define que essa vari�vel � do tipo double,
	 *  ent�o n�o � necess�riamente necess�rio definir o tipo da vari�vel, mas todas as outras do mesmo tipo ter�o que 
	 *  ser do mesmo tipo (double, string, int).  
	 */
	public static void main(String[] args) {
		
		double a = 4.5; // Declara��o e Incializa��o da Vari�vel
		System.out.println(a); // Uso da Vari�vel
		
		// � poss�vel colocar inteiros em vari�veis double, mas n�o o contr�rio 
		a = 12; 
		System.out.println(a);
		
		var b = 4.3;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Texto diferente";
		System.out.println(c);
		// todas as vari�veis usadas em c precisar�o ser, necesssariamente do tipo String
		
		double d; // Vari�vel Declarada
		d = 123.65; // Vari�vel Inciada
		System.out.println(d); // Vari�vel Usada
		
	}
	
}
