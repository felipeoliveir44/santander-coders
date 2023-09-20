package entendendo_enum;

import java.util.Iterator;

import entendendo_enum.Enum.DiaSemana;
import entendendo_enum.Enum.EstadoBrasileiro;

public class SistemIbge {
	public static void main(String[] args) {
		for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
			
		for(DiaSemana ds: DiaSemana.values()) {
			System.out.println("Hoje é: " + ds.getDiaSemana());
		}
		}
}
