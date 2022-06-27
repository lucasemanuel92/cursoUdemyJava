package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);

		// Tabelas Verdades
			
			// Tabela E - AND (&&), ambas as afirmações precisam ser verdadeiras
		System.out.println("\nTabela verdade E - AND (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
			// Tabela OU - OR (||), apenas uma das afirmações precisam ser verdadeiras
		System.out.println("\nTabela verdade OU - OR (||)");
		//System.out.println(true || true);
		//System.out.println(true || false);  
		System.out.println(false || true);
		System.out.println(false || false);
		
			// Tabela verdade OU EXCLUSIVO - XOR (^), só uma das afirmações pode ser verdadeira
		System.out.println("\nTabela verdade OU EXCLUSIVO - XOR (^)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
			//Tabela verdade do NOT (!), inverten as condições e !! volta ao orginal
		System.out.println("\nTabela verdade do NOT (!)");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);
		System.out.println(!!false);
	}

}
