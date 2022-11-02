package com.projeto.palpite.dto;

import java.io.Serializable;

import com.projeto.palpite.entities.Participante;

public class ParticipanteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String idade;
	private String email;
	private String idioma;
	private String nomePalpite;
	private String grupo;
	
	
	

	public ParticipanteDTO() {

	}

	public ParticipanteDTO(Participante entity) {
		id = entity.getId();
		nome = entity.getNome();
		idade = entity.getIdade();
		email = entity.getEmail();
        idioma = entity.getIdioma();
		nomePalpite = entity.getPalpites().getTime().getNomePalpite();
		grupo = entity.getPalpites().getTime().getGrupo();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getNomePalpite() {
		return nomePalpite;
	}

	public void setNomePalpite(String nomePalpite) {
		this.nomePalpite = nomePalpite;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
