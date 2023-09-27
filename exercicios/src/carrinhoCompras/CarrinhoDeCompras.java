package carrinhoCompras;
import java.util.ArrayList;
import java.util.List;



public class CarrinhoDeCompras {
	
	private List<Item> itemLista;
	
	public CarrinhoDeCompras() {
		this.itemLista = new ArrayList<>();
	}
	
	public void adicionarItemCarrinho(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		
		itemLista.add(item);
	}
	
	public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    if (!itemLista.isEmpty()) {
      for (Item i : itemLista) {
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      itemLista.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }
	
	public int obterNumeroTotalItems() {
		return itemLista.size();
	}
	
	
	public void obterDescricaoItems() {
		if(!itemLista.isEmpty()) {
			System.out.println(itemLista);
		} else {
			System.out.println("A lista está vazia!");
		}
		
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
	    if (!itemLista.isEmpty()) {
	      for (Item item : itemLista) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	} 
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItemCarrinho("Água", 10.20, 1);
		carrinho.adicionarItemCarrinho("Energetico", 5.30, 1);
		System.out.println("Quantidade de items no carrinho: " + carrinho.obterNumeroTotalItems());
		carrinho.obterDescricaoItems();
		System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
		
	}
}
