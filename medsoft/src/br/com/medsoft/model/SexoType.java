package br.com.medsoft.model;

public enum SexoType {

	N("Masculino"), F("Feminino");

	private String descricao;

	private SexoType(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
