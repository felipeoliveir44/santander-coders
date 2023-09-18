package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Luiz Felipe", "999.999.999-99", 19);
		
		System.out.println("Seu nome é: " + pessoa.getNome() + ", seu CPF é: " + pessoa.getCpf() + " e sua idade é: " + pessoa.getIdade());
		
		
	}
}

    

