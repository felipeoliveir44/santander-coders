package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	public static List<Users> user = new ArrayList<>();
	static int contador = 1;
	int indice;
	
	public static void main(String[] args) {
		
		adicionarUsuario();
		retornarTodosUsuarios();
		retornarUsuario(2);
		
	}
	
	public static void adicionarUsuario() {
		while (user.size() < 3) {
			System.out.println("Digite seu nome - Usuario " + contador);
			String nome = scanner.nextLine();
			
			System.out.println("Digite seu sobrenome - Usuario " + contador);
			String sobrenome = scanner.nextLine();
			
			System.out.println("Digite sua idade - Usuario " + contador);
			int idade = scanner.nextInt();
			// Consuma a nova linha pendente
            scanner.nextLine();
			user.add(new Users(nome, sobrenome, idade));
			contador++;
        }
		
	}
	
	public static void retornarTodosUsuarios() {
		for(Users users : user) {
			System.out.println(users.getPrimeiroNome());
		}
	}
	
	public static void retornarUsuario(int indice) {
		System.out.println("Usuario retornado: " + user.get(indice));
	}
}
