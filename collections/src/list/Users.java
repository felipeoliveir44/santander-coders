package list;

public class Users {
	private String primeiroNome;
	private String sobrenome;
	private int idade;
	
	public Users(String primeiroNome, String sobrenome, int idade) {
		this.idade = idade;
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Seu nome é " + primeiroNome + " " + sobrenome + " e tem " + idade + " anos" ;
	}
	
}
