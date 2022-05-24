package fundamentos;

import java.util.Scanner;

public class TiposStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2".equals(s1)); // .equals compara as strings
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2".equals(s2.trim())); // .trim() tira os possíveis espaços em branco
		
		entrada.close();
	}

}


// Usar o .equals() para comprar as strings ao invés do ==