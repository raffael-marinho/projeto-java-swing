package br.com.medsoft.model;

public class Contato {
	private String email;
	private String celular;

	public Contato() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [email=").append(email).append(", celular=").append(celular).append("]");
		return builder.toString();
	}

}