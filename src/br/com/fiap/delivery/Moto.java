package br.com.fiap.delivery;

public class Moto extends Veiculo {
	private boolean possuiBau;

	public Moto(String placa, double capKg, boolean possuiBau) {
		super(placa, capKg);
		this.possuiBau = possuiBau;
	}

	public boolean isPossuiBau() {
		return possuiBau;
	}
}
