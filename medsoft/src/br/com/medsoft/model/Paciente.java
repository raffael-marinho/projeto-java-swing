/**
 * 
 */
package br.com.medsoft.model;

import java.util.Objects;

/**
 * 
 */
public class Paciente {

	private long id;
	private String nome;
	private String rg;
	private String cpf;
	private SexoType sexo;

	private Endereco endereco;

	private Contato contato;

	public Paciente(long id, String nome, String rg, String cpf, SexoType sexo, Endereco endereco, Contato contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Paciente(long id, String nome, String rg, String cpf, SexoType sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public Paciente(String nome, String rg, String cpf, SexoType sexo) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public SexoType getSexo() {
		return sexo;
	}

	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, id, nome, rg, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(cpf, other.cpf) && id == other.id && Objects.equals(nome, other.nome)
				&& Objects.equals(rg, other.rg) && sexo == other.sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [id=").append(id).append(", nome=").append(nome).append(", rg=").append(rg)
				.append(", cpf=").append(cpf).append(", sexo=").append(sexo).append(", endereco=").append(endereco)
				.append(", contato=").append(contato).append("]");
		return builder.toString();
	}

}
