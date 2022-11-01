package com.projeto.palpite.dto;

import java.io.Serializable;

public class PalpiteInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String idioma;
	private String email;
	private String idade;
	private String nometime;
	private String grutpoTime;

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNometime() {
		return nometime;
	}

	public void setNometime(String nometime) {
		this.nometime = nometime;
	}

	public String getGrutpoTime() {
		return grutpoTime;
	}

	public void setGrutpoTime(String grutpoTime) {
		this.grutpoTime = grutpoTime;
	}

	private Long timeId;

	public PalpiteInsertDTO() {

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

	public Long getTimeId() {
		return timeId;
	}

	public void setTimeId(Long timeId) {
		this.timeId = timeId;
	}

}
