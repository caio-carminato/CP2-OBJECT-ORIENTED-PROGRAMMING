package br.com.fiap.delivery;

public class Caminhao extends Veiculo {
	private int numeroEixos;

	public Caminhao(String placa, double capKg, int numeroEixos) {
		super(placa, capKg);
		this.numeroEixos = numeroEixos;
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}
}