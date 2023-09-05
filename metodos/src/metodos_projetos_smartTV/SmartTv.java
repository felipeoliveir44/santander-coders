package metodos_projetos_smartTV;

public class SmartTv {
	// Criação da classe e variaveis
	boolean ligada = false;
	int canal = 1;
	int volume = 10;
	
	// Criação dos métodos - ações da classe
	
	public void ligar() {
		System.out.println("Ligando a TV");
		ligada = true;
	}
	
	public void desligar() {
		System.out.println("Desligando a TV");
		ligada = false;
	}
	
	public void aumentarVolume() {
		System.out.println("Aumentando o volume");
		volume++;
		System.out.println("Volume atual: " + volume);
	}
	
	public void abaixarVolume() {
		System.out.println("Abaixando o volume");
		volume--;
		System.out.println("Volume atual: " + volume);
	}
	
	public void canalAcima() {
		canal++;
		System.out.println("Você está no canal: " + canal);
	}
	
	public void canalAbaixo() {
		canal--;
		System.out.println("Você está no canal: " + canal);
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Você está no canal: " + canal);
	}
}
