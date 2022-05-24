package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		
		double media = 4.8;
		String resultadoParcial = media >=5 ? "em recuperação" : "reprovado";
		String resultado = media >= 7 ? "aprovado" : resultadoParcial;
	
		
		System.out.println("o aluno está " + resultado);
		

	}

}
