package pesquisa_list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	public static void main(String[] args) {
		
		// Criando uma instância do catálogo de livros
	    CatalogoLivros catalogoLivros = new CatalogoLivros();

	    // Adicionando livros ao catálogo
	    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
	    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
	    System.out.println("-------------------------------------------------------------------");
	    // Exibindo livros pelo mesmo autor
	    System.out.println(catalogoLivros.pesquisaPorAutor("Robert C. Martin"));
	    
	    System.out.println("-------------------------------------------------------------------");
	    
	 // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
	    System.out.println(catalogoLivros.pesquisaPorAutor("Autor Inexistente"));
	    System.out.println("-------------------------------------------------------------------");

	    // Exibindo livros dentro de um intervalo de anos
	    System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2010, 2022));
	    System.out.println("-------------------------------------------------------------------");

	    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
	    System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2025, 2030));
	    System.out.println("-------------------------------------------------------------------");

	    // Exibindo livros por título
	    System.out.println(catalogoLivros.pesquisaPorTitulo("Java Guia do Programador"));
	    System.out.println("-------------------------------------------------------------------");

	    // Exibindo livros por título (caso em que não há livros com o título especificado)
	    System.out.println(catalogoLivros.pesquisaPorTitulo("Título Inexistente"));
	    System.out.println("-------------------------------------------------------------------");
	}
	
	private List<Livros> livroList;
	
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livros(titulo, autor, anoPublicacao));
		System.out.println("Livro: " + titulo + " adicionado");
	}
	
	public List<Livros> pesquisaPorAutor(String autor) {
		List<Livros> livrosPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livros l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			return livrosPorAutor;
		}else {
		      throw new RuntimeException("A lista está vazia!");
		    }
		
		
	}
	
	public List<Livros> pesquisaPorIntervaloAno(int anoInicial, int anoFinal) {
		List<Livros> livrosPorIntervaloAno = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livros l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAno.add(l);
				}
			}
		}
		return livrosPorIntervaloAno;
	}
	
	public Livros pesquisaPorTitulo(String titulo) {
		Livros livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livros l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
}