package somaNumeros;

import java.util.ArrayList;
import java.util.List;


public class SomaNumeros {
	
	private List<Integer> numerosList;
	
	public SomaNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumeros(int numero) {
		this.numerosList.add(numero);
	}
	
	public int calcularSoma() {
	    int soma = 0;
	    for (Integer numero : numerosList)
	      soma += numero;
	    return soma;
	  }

	  public int encontrarMaiorNumero() {
	    int maiorNumero = Integer.MIN_VALUE;
	    if (!numerosList.isEmpty()) {
	      for (Integer numero : numerosList) {
	        if (numero >= maiorNumero) {
	          maiorNumero = numero;
	        }
	      }
	      return maiorNumero;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }

	  public int encontrarMenorNumero() {
	    int menorNumero = Integer.MAX_VALUE;
	    if (!numerosList.isEmpty()) {
	      for (Integer numero : numerosList) {
	        if (numero <= menorNumero) {
	          menorNumero = numero;
	        }
	      }
	      return menorNumero;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }

	  public void exibirNumeros() {
	    if (!numerosList.isEmpty()) {
	      System.out.println(this.numerosList);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	  
	  public static void main(String[] args) {
			SomaNumeros somaNumeros = new SomaNumeros();
			somaNumeros.adicionarNumeros(3);
			 // Adicionando números à lista
		    somaNumeros.adicionarNumeros(5);
		    somaNumeros.adicionarNumeros(0);
		    somaNumeros.adicionarNumeros(0);
		    somaNumeros.adicionarNumeros(-2);
		    somaNumeros.adicionarNumeros(10);

		    // Exibindo a lista de números adicionados
		    System.out.println("Números adicionados:");
		    somaNumeros.exibirNumeros();

		    // Calculando e exibindo a soma dos números na lista
		    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

		    // Encontrando e exibindo o maior número na lista
		    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

		    // Encontrando e exibindo o menor número na lista
		    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
		}
}
