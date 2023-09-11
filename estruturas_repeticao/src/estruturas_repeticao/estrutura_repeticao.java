
package estruturas_repeticao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class estrutura_repeticao {
	public static void main(String[] args) {
		
		// For
		for(int numeros = 1; numeros <= 20; numeros++) {
			System.out.println("Número: " + numeros);
		}
		
		// For em array
		
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int x=0; x<alunos.length; x++) {
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		}
		
		// For each
		
		for(String aluno : alunos) {
			System.out.println("Nome do aluno: " + aluno);
		}
		
		// While
		
		double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
     // Do while
        
        do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	
        
        
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
		}
		
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
   
			
			

}

