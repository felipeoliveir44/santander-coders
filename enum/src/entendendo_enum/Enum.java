package entendendo_enum;

public class Enum {
	// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
	public enum EstadoBrasileiro {
		SAO_PAULO ("SP","São Paulo"),
		RIO_JANEIRO ("RJ", "Rio de Janeiro"),
		PIAUI ("PI", "Piauí"),
		MARANHAO ("MA","Maranhão") ;
		
		private String nome;
		private String sigla;
		
		private EstadoBrasileiro(String sigla, String nome) {
			this.sigla = sigla;
			this.nome = nome;
		}
		public String getSigla() {
			return sigla;
		}
		public String getNome() {
			return nome;
		}
		public String getNomeMaiusculo() {
			return nome.toUpperCase();
		}
		
	}
	
	public enum DiaSemana {
		SEGUNDA ("SEG", 1),
		TERCA ("TER", 2),
		QUARTA ("QUA", 3),
		QUINTA ("QUI", 4),
		SEXTA ("SEX", 5),
		SABADO ("SAB", 6),
		DOMINGO ("DOM", 7);
		
		private String diaSemana;
		private int numeroDiaSemana;
		
		private DiaSemana(String diaSemana, int numeroDiaSemana) {
			this.diaSemana = diaSemana;
			this.numeroDiaSemana = numeroDiaSemana;
		}

		public String getDiaSemana() {
			return diaSemana;
		}

		public int getNumeroDiaSemana() {
			return numeroDiaSemana;
		}
	
	}
}

