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
@Table(name = "tb_palpites")
public class Palpites implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long palpite_id;
	private Long primeiro;
	private Long segundo;
	private Long terceiro;

	@ManyToOne
	@JoinColumn(name = "id_participante")
	private Participante participante;
	
//	@ManyToOne
//	@JoinColumn(name = "id_time")
//	private Time time;

	public Palpites() {
	}

	public Palpites(Long palpite_id, Long primeiro, Long segundo, Long terceiro, Participante participante) {
		super();
		this.palpite_id = palpite_id;
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.terceiro = terceiro;
		this.participante = participante;
	}

	public Long getPalpite_id() {
		return palpite_id;
	}

	public void setPalpite_id(Long palpite_id) {
		this.palpite_id = palpite_id;
	}

	public Long getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Long primeiro) {
		this.primeiro = primeiro;
	}

	public Long getSegundo() {
		return segundo;
	}

	public void setSegundo(Long segundo) {
		this.segundo = segundo;
	}

	public Long getTerceiro() {
		return terceiro;
	}

	public void setTerceiro(Long terceiro) {
		this.terceiro = terceiro;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(palpite_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palpites other = (Palpites) obj;
		return Objects.equals(palpite_id, other.palpite_id);
	}

}