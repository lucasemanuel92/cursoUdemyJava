package fundamentos.operadores;

public class Atribuiçao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a; 
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;

		System.out.println(c);
		
		c %= 2; // c = c % 2; se o resto for 0 o numero é par, se for 1 é impar.
		
		System.out.println(c);
		
		

	}

}
