package copiaMsnPoo;

public class MsnMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem enviada do MSN");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem recebida do MSN");
		salvarHistoricoMensagem();
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		
		System.out.println("Salvando historico da mensagem - MSN");
		
	}
	
}
