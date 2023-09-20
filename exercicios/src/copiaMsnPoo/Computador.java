package copiaMsnPoo;

public class Computador {
	public static void main(String[] args) {
		
		// MSN
		
		MsnMessenger msn = new MsnMessenger();
		
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Facebook fb = new Facebook();
		
		fb.enviarMensagem();
		fb.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
