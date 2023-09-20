package copiaMsnPoo;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem enviada do Telegram");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida do Telegram");
		
	}
	
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando historico da mensagem - Telegram");
		
	}
}
