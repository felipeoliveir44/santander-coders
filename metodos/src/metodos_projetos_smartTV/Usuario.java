package metodos_projetos_smartTV;

public class Usuario {
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		/* System.out.println("Tv ligada?: " + smartTv.ligada);
		System.out.println("Qual o canal atual?: " + smartTv.canal);
		System.out.println("Qual o volume atual?: " + smartTv.volume); */
		
		smartTv.ligar(); // True
		smartTv.aumentarVolume(); // 11
		smartTv.aumentarVolume();  // 12
		smartTv.abaixarVolume(); // 11
		smartTv.canalAcima(); // 2
		smartTv.mudarCanal(15); // 15
		smartTv.canalAcima(); // 16
		smartTv.canalAcima(); // 17
		smartTv.canalAbaixo(); // 16
		smartTv.mudarCanal(10);
		
		
	}
}
