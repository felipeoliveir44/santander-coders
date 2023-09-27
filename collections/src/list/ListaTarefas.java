package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListaTarefas {
	
	public static String descricaoTarefa;
	static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		System.out.println("Digite o nome da tarefa");
		descricaoTarefa = scanner.next();
		System.out.println("Tarefa adicionada");
		listaTarefas.adicionarTarefa(descricaoTarefa);

		System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.obterDescricaoTarefas();
	
	}
	
	private List<Tarefa> tarefaList;
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for(Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t); 
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	public void obterValorTotalItem() {
		
	}
}