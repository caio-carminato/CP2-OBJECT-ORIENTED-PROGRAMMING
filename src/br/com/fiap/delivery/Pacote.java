package br.com.fiap.delivery;

public class Pacote {
	private String codigo;
	private double pesoKg;
	private String status;

	public Pacote(String codigo, double pesoKg, String status) {
		this.codigo = codigo;
		this.pesoKg = pesoKg;
		this.status = status;
	}

	public void atualizarStatus(String novoStatus) {
		this.status = novoStatus;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
