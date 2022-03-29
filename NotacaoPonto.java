package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		
				// rimeiro modelo, estabelecendo o tipo e depois usando o método "."
				String s = "Bom dia x";
				s = s.replace("x", "Senhora");
				s = s.toUpperCase();
				s = s.concat("!!!!");
			
				System.out.println(s);
				
			
				// Segundo modelo, usando o método "." direto na string
				String x = "Lucas".toUpperCase();
				System.out.println(x);
				
				
				// Terceiro modelo, quebrando o "." em várias linhas, ajudando a não ficar muito grande a linha
				String y = "Bom dia X"
						.replace("X", "Lucas")
						.toUpperCase()
						.concat("!!!!");
				System.out.println(y);
				
				// Tipos primitivos não tem o operador "."
	}
	
}
