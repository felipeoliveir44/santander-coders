package anatomia_classe_3;

public class AnatomiaClasse3 {
	public static void main(String[] args) {
		String meuNome = "Luiz";
		int anoNascimento = 2003;
		
		boolean verdadeira = true;
		
		anoNascimento = 2004;
		
		String primeiroNome = "Luiz";
		String segundoNome = "Felipe";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
		
	}
}
