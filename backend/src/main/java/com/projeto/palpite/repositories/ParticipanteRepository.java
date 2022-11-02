package com.projeto.palpite.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.palpite.entities.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {

	@Query("SELECT obj FROM Participante obj")
	Page<Participante> findbynome(PageRequest pagerequest);

}
