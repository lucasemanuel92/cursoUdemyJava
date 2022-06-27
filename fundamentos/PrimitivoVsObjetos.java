package fundamentos;

public class PrimitivoVsObjetos {

	public static void main(String[] args) {

		String s = new String("texto");
		s.toUpperCase();

		// Wrappers são versão objetos dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}

}
