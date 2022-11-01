package com.projeto.palpite.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_participante")
public class Participante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String idade;
	private String email;
	private String idioma;

	@OneToMany(mappedBy = "participante")
	private List<Palpite> palpite = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "palpite_id")
	private Palpite palpites;

	public Participante() {

	}

	public Participante(Long id, String nome, String idade, String email, String idioma, List<Palpite> palpite) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.idioma = idioma;
		this.palpite = palpite;
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

	public List<Palpite> getPalpite() {
		return palpite;
	}

	public void setPalpite(List<Palpite> palpite) {
		this.palpite = palpite;
	}

	public Palpite getPalpites() {
		return palpites;
	}

	public void setPalpites(Palpite palpites) {
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
		Participante other = (Participante) obj;
		return Objects.equals(id, other.id);
	}

}
