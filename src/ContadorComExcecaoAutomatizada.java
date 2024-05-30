
import java.util.Scanner;

public class ContadorComExcecaoAutomatizada {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.println("\nBem-vindo ao Contador Automatizado\n");

        /*Optei por fazer a exceção com o While, para que no momento em que o usuário digitar os
         valores incorretos o programa solicita novamente sem precisar inicia-lo novamente */

		while(true) {

            System.out.println("Digite o primeiro parâmetro");
		    int valorEntradaUm = scanner.nextInt();

            System.out.println();

		    System.out.println("Digite o segundo parâmetro");
		    int valorEntradaDois = scanner.nextInt();

            System.out.println();

            if (valorEntradaUm < valorEntradaDois) {
                int contagem = valorEntradaDois - valorEntradaUm;
            
                for(int i = 0; i < contagem; i++) {
                    System.out.println("Contando: " + (i + 1));
                }
                scanner.close();
                System.out.println();
                System.out.println("Programa finalizado com sucesso!\n");
                break;

            } else {
            System.out.println("O primeiro valor digitado não pode ser maior que o segundo valor digitado\n");
            }
        }
        

    }
	
}