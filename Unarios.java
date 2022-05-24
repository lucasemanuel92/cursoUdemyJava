package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		a++; // Incrementa +1 a = a + 1 
		a--; // Decrementa =1 a = a - 1
		
		++b; // forma pré-fixada
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		
		
		/* 
		 * Quando eu coloco da forma pré-fixada ele acrescenta e depois compara.
		 * Quando eu coloco na forma pós-fixada ele compara e depois acrescenta.
		 */
	}

}
