package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double VALOR = 32;
		final double FATOR = 5.0/9.0;
		
		double farenheit = 86;
		double celsius = (farenheit - VALOR) * FATOR;
		System.out.println("A temperatura é " + celsius);
		
		
		
		farenheit = 150;
		celsius = (farenheit - VALOR) * FATOR;
		System.out.println("A temperatura é " + celsius);
		
	}
}
