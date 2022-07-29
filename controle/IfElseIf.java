package controle;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Inválida");
		} else if(nota >= 8.1 ) {
			System.out.println("Conceito A");
			System.out.println("Aprovado");
		} else if(nota >= 6.1 ) {
			System.out.println("Conceito B");
			System.out.println("Aprovado");
		} else if(nota >= 4.1) {
			System.out.println("Conceito C");
			System.out.println("Recuperação");
		} else if(nota >= 2.1) {
			System.out.println("Conceito D");
			System.out.println("Reprovado");
		} else if(nota >= 0) {
			System.out.println("Conceito E");
			System.out.println("Reprovado");
		}
		
		System.out.println("Fim do sistema");
		entrada.close();

	}

}
