package com.projeto.palpite.dto;

import java.io.Serializable;

import com.projeto.palpite.entities.Time;

public class TimeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String img;
	private String nomePalpite;
	private String grupo;

	public TimeDTO(Time entity) {
		id = entity.getId();
		img = entity.getImg();
		nomePalpite = entity.getNomePalpite();
		grupo = entity.getGrupo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
