package com.projeto.palpite.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_palpites")
public class Palpite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)

	@JoinColumn(name = "id_participante")
	private Participante participante;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_time")
	private Time time;

	@OneToMany(mappedBy = "palpites")
	private List<Participante> participantes = new ArrayList<>();

	public Palpite() {
	}

	public Palpite(Long id, Time time, Participante participantes) {
		super();
		this.id = id;
		this.time = time;
		this.participante = participantes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public List<Participante> getParticipantes() {
		return participantes;
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
		Palpite other = (Palpite) obj;
		return Objects.equals(id, other.id);
	}

}