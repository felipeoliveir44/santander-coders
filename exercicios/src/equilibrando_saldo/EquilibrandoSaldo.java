package equilibrando_saldo;

import java.util.Locale;
import java.util.Scanner;

public class EquilibrandoSaldo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu saldo atual");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Digite o valor do deposito");
        double valorDeposito = scanner.nextDouble();
        System.out.println("Digite o valor de retirada");
        double valorRetirada = scanner.nextDouble();
        double resultado = saldoAtual + valorDeposito - valorRetirada;
        
        System.out.println("Saldo atualizado na conta: " + resultado);  
    }

}
