package validacao_processo_seletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class validacao_processo_seletivo {
	public static void main(String[] args) {
		
		case1(2000);
		case2();
		case3();
		case4("JULIA");
		
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
	
	 static void case2() {
		int salarioBase = 2000;
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int totalSelecionados = 0;
		int proximoCandidato = 0;
		
		while(totalSelecionados < 5 && proximoCandidato < candidatos.length) {
			String candidato = candidatos[proximoCandidato++];
			double valorPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
			if(valorPretendido > salarioBase) {
				System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
				
			}
			else {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
				totalSelecionados++;
			}
			System.out.println("Total de selecionados: " + totalSelecionados);
			System.out.println("Total de consultados: " + proximoCandidato);
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		}
		
		
	}
	 
	 static void case3() {
			String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
			
			
			
			//forma abrevida
			//interação total sem precisar da posição ou indice
			System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
			
			for(String candidato: candidatosSelecionados) {
				System.out.println(candidato);
				
			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		}
	static void case4(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	 
	 static boolean atender() {
			return new Random().nextInt(3)==1;	
		}
		 
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}