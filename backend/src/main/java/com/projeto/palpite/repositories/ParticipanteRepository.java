package com.projeto.palpite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.palpite.entities.Participante;

@Repository
public interface ParticipanteRepository  extends JpaRepository<Participante, Long>{

	}

	
