package poo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		jeep.ligar();
		jeep.setChassi("32131");
		
		Moto z400 = new Moto();
		
		z400.setChassi("321321");
		z400.ligar();
		
		Veiculo coringa = z400;
		
		coringa.ligar(); // a variavel coringa recebe todos os métodos da classe Moto
	}
	
}
