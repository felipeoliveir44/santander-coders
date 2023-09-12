package grande_deposito;

import java.util.Scanner;

public class GrandeDeposito {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
        }
    }
}	
