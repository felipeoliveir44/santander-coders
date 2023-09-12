package juros_compostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        // Calcula o valor final com juros compostos
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}
