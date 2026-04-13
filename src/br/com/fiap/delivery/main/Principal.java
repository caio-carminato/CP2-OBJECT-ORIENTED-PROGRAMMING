package br.com.fiap.delivery.main;

import br.com.fiap.delivery.Caminhao;
import br.com.fiap.delivery.Pacote;
import br.com.fiap.delivery.Rota;

public class Principal {
	public static void main(String[] args) {
		
		Caminhao caminhao = new Caminhao("ABC-1234", 15000.0, 3);

		
		Pacote pacote = new Pacote("BR999", 10.5, "Pendente");

		
		Rota rota = new Rota(pacote, caminhao);

		
		System.out.println(" SISTEMA FIAP DELIVERY ");
		System.out.println("Status Inicial do Pacote: " + pacote.getCodigo());
		System.out.println("Veículo designado: Caminhão de placa " + caminhao.getPlaca());
		System.out.println("Capacidade de carga: " + caminhao.getCapacidadeKg() + "kg");
		System.out.println("Número de eixos: " + caminhao.getNumeroEixos());
		

		
		rota.iniciarEntrega();

		
		pacote.atualizarStatus("Em trânsito");
		System.out.println("Novo status do pacote: BR999 está Em trânsito.");
		
	}
}