import java.util.Scanner;

public class ContadorPropostoDesafio {

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

        System.out.println();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

		terminal.close();
	}
	

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if (parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O primeiro valor digitado não pode ser maior ou igual ao segundo valor digitado");
		}

		int contagem = parametroDois - parametroUm;

		for(int i = 0; i < contagem; i++) {
			System.out.println("Contando: " + (i + 1));
		}
		
	}
	
}

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String message) {
		super(message);
	}
}
