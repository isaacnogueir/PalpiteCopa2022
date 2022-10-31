package com.projeto.palpite.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_time")
public class Time implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String img;
	private String nomePalpite;
	private String grupo;

	@OneToMany(mappedBy = "time")
	private List<Palpite> palpites = new ArrayList<>();

	public Time() {

	}

	public Time(Long id, String img, String nomePalpite, String grupo, List<Palpite> palpites) {
		super();
		this.id = id;
		this.img = img;
		this.nomePalpite = nomePalpite;
		this.grupo = grupo;
		this.palpites = palpites;
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

	public List<Palpite> getPalpites() {
		return palpites;
	}

	public void setPalpites(List<Palpite> palpites) {
		this.palpites = palpites;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return Objects.equals(id, other.id);
	}

}
