package fundamentos;

//import java.util.Scanner;

public class Wrapper {

	// Como converter os tipos primitivos em classes. 
	/* Normalmente os tipos primitivos tem letra minúsculas, mas o int muda para Integer e char para Character
	 *  para se tornar objeto se usa a letra incial maiúscula.
	 */
	

	public static void main(String[] args) {
		
		
		//Scanner entrada = new Scanner(System.in);
		
		
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next()) para transformar o int em uma string e poder manipular no println
		Integer i = 10000;
		Long l = 10000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 4);
		System.out.println(l / 2 );
		//entrada.close();
		
		Float f = 123F;
		System.out.println(f);
		
		Double d = 123.45678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
	}

}
