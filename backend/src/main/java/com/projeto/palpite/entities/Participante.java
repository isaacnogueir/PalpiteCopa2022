package com.projeto.palpite.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_participante")
public class Participante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_participante;
	private String nome;
	private String idade;
	private String email;
	private String idioma;

	public Participante() {

	}

	public Participante(Long id_participante, String nome, String idade, String email, String idioma) {
		super();
		this.id_participante = id_participante;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.idioma = idioma;
	}

	public Long getId_participante() {
		return id_participante;
	}

	public void setId_participante(Long id_participante) {
		this.id_participante = id_participante;
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

	@Override
	public int hashCode() {
		return Objects.hash(id_participante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(id_participante, other.id_participante);
	}


}
