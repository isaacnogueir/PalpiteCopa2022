package com.projeto.palpite.dto;

import java.io.Serializable;

public class ParticipanteInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;
	private String idade;
	private String idioma;
	private String nome;
	private long palpite_id;

	public ParticipanteInsertDTO() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public long getPalpite_id() {
		return palpite_id;
	}

	public void setPalpite_id(long palpite_id) {
		this.palpite_id = palpite_id;
	}

}
