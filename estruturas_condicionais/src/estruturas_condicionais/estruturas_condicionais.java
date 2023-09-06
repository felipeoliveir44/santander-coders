package estruturas_condicionais;

public class estruturas_condicionais {
	 public static void main(String[] args) {
		 // Condicional simples
		 
	       double saldo = 25.0;
	       double valorSolicitado = 17.0;

	       if(valorSolicitado < saldo)
	        saldo = saldo - valorSolicitado;

	        System.out.println(saldo);
	        
	        // Condicional composta
	        
	        int nota = 6;
	            
	        if(nota >= 7)
	        	System.out.println("Aprovado");

	        else
	           System.out.println("Reprovado");
	        
	        // Condicional encadeada
	        
	        int nota2 = 6;

	    	if (nota2 >= 7)
	    		System.out.println("Aprovado");
	    	else if (nota2 >= 5 && nota2 < 7)
	    		System.out.println("Recuperação");
	    	else
	    		System.out.println("Reprovado");
	    	
	    	// Condição ternária
	    	
	    	int nota3 = 7;
			String resultado = nota3 >=7 ? "Aprovado" : "Reprovado";
			System.out.println(resultado);
			
			// switch case
			
			String sigla = "M";

			switch (sigla) {
			case "P":{
				System.out.println("PEQUENO");
				break;
			}
			case "M":{
				System.out.println("MÉDIO");
				break;
			}
			case "G":{
				System.out.println("GRANDE");
				break;
			}
			default:
				System.out.println("INDEFINIDO");
			}
			
		}
	  }        	

