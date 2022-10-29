package com.projeto.palpite.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_time")
public class Time implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_time;
	private String nome;
	private String img;

	public Time() {

	}

	public Time(Long id_time, String nome, String img) {
		super();
		this.id_time = id_time;
		this.nome = nome;
		this.img = img;
	}

	public Long getId_time() {
		return id_time;
	}

	public void setId_time(Long id_time) {
		this.id_time = id_time;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id_time);
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
		return Objects.equals(id_time, other.id_time);
	}

}
