package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
	
		System.out.println(2 > 4);
		System.out.println(2 >= 4); // Igual sempre depois do maior ou menor
		System.out.println(2 < 4);
		System.out.println(2 <= 4);
		System.out.println(2 != 4); // != é diferente

		double nota = 9.7;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto ? " + temDesconto);

	}

}
