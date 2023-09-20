package poo;

public class Carro extends Veiculo {

	
	
	private void conferirCombustivel() {
		System.out.println("Conferindo combustivel");
	}

	private void conferirCambio() {
		System.out.println("Conferindo cambio");
	}

	@Override
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("Carro ligado");
		
	}

	
}
