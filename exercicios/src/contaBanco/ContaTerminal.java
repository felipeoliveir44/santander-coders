package contaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	int numero;
	String agencia;
	String nomeCliente;
	double saldo;
	
	public static void main(String[] args) {
		//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da agência!");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o nome da agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.next();
        scanner.nextLine();
        
        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        
	}
}
