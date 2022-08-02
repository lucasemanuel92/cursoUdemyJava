package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}
		if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}
		if(dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println("3");
		}
		if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}
		if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}
		if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}
		if(dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia Inválido");
		}
		
		
		
		entrada.close();
	}

}


/* 		Proposta do exercício
 * 			Domingo -> 1
 * 			Segunda -> 2
 * 			Terça -> 3 
 * 			Assim por diante até o sábado -> 7
 * 
 * */
 