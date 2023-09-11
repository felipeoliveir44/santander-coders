package validacao_processo_seletivo;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class validacao_processo_seletivo_teste {
	public static void main(String[] args) {
		List<String> candidatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(candidatos);
        while(candidatos.size() < 2) {
            cadastroCandidato(scanner, candidatos);
            System.out.println("-----------");
            
        }
        
        System.out.println(candidatos); 
}
	
	public static void case1(int salarioPretentido) {
		int salarioBase = 2000;
		
		if (salarioBase > salarioPretentido) {
			System.out.println("Ligar para o candidato");
			
		}
					
		else if (salarioBase == salarioPretentido) {
			System.out.println("Ligar para o candidato, com contra proposta");
		}
			
		else {
			System.out.println("Aguardando resultado dos demais candidatos");
			
		}	
		System.out.println("----------------------------------------------------------------------------------------------------------------");
	}
	
	public static void cadastroCandidato(Scanner scanner, List<String> candidatos) {
        String nome; 
        String sobrenome;
        int idade;
        Double pretensaoSalarial;

        System.out.println("Digite seu nome");
        nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        System.out.println("Digite sua pretenção salarial");
        pretensaoSalarial = scanner.nextDouble();

        String dadosCandidato = "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Pretenção Salarial: " + pretensaoSalarial;
        candidatos.add(dadosCandidato);

        System.out.println("Candidato cadastrado.");
    }
}
