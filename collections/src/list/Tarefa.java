package list;

import java.util.Iterator;

public class Tarefa {

	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		
		return "Tarefa: " + descricao;
	}
	
	
}
