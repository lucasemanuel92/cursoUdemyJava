package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
				
		String s = "Boa tarde";
		s = s.toUpperCase();
		
		// O comando s. tr�s v�rias op��es de comandos com a string.
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("BOA"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		// Essa � uma das formas de escrever uma s�rie de informa��es. O comando \n � para quebrar a linha.
		
		System.out.println("Nome:" + nome 
				+ "\nSobrenome:" + sobrenome
				+ "\nIdade: " + idade
				+ "\nSal�rio: " + salario + "\n\n");
		
		/* 
		 * O printf � usado para escrever a frase e adotar os valores sendo %s para strings, %d para inteiros e 
		 * %f para float. � poss�vel determinar o numero de casas decimais no float usando .3f por exemplo, dessa forma 
		 * ele vai mostrar 3 casas decimais.
		 */
		
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.3f", nome, sobrenome, idade, salario);
		
		// O comando String.format � usado da mesma maneira que o anterior, mas precisa de um println depois.
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.3f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		// O comando .algumacoisa pode ser usado direito no println
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
	}
	
}
