package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		// Mantem na mesma linha
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		// Imprime e quebra a linha automaticamente
		System.out.println("Bom");
		System.out.println("dia!");
		
		// Monta a express�o usando simbolos e associa os simbolos depois.
		System.out.printf("Megasena: %d %d %d %d\n", 1, 2, 3, 4);
		System.out.printf("Sal�rio: %.1f\n", 1234.4678);
		
		// Entradas
		Scanner entrada = new Scanner(System.in);
		
		// O comando next.Line � para strings
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\nNome = " + nome + " " + sobrenome);
		
		// O comando next.Int � para captar inteiros e existem v�rios comandos do tipo next. um para cada tipo de informa��o
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
