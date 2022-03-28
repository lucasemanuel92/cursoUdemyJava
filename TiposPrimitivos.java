package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Info de um funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.1;
		
		
		// Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		// Tipo caractere
		char status = 'A'; // um unico elemente pode ser colocado, podendo ser numero, letra ou simbolo
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos Acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		// Foi necessa�rio colocar um System.out.println() relacionando a cada vari�vel para n�o gerar advertencias do sistema.
	}
}
