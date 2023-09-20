package copiaMsnPoo;

public class Facebook extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Mensagem enviada do Facebook");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Mensagem recebida do Facebook");
		
	}
	@Override
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando historico da mensagem - Facebook");
		
	}
}
