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
	private String nomePalpite;
	private String img;

	@OneToMany(mappedBy = "time")
	private List<Palpites> palpites = new ArrayList<>();

	public Time() {

	}

	public Time(Long id, String nomePalpite, String img) {
		super();
		this.id = id;
		this.nomePalpite = nomePalpite;
		this.img = img;
	}

	public Long getId_time() {
		return id;
	}

	public void setId_time(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nomePalpite;
	}

	public void setNome(String nome) {
		this.nomePalpite = nome;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
