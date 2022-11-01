package com.projeto.palpite.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.palpite.dto.PalpiteDTO;
import com.projeto.palpite.dto.PalpiteInsertDTO;
import com.projeto.palpite.entities.Palpite;
import com.projeto.palpite.entities.Participante;
import com.projeto.palpite.repositories.PalpiteRepository;
import com.projeto.palpite.repositories.ParticipanteRepository;

@Service
public class PalpiteService {

	@Autowired
	private ParticipanteRepository participanterepository;

	@Autowired
	private PalpiteRepository palpiterepository;

	@Transactional
	public PalpiteDTO insert(PalpiteInsertDTO dto) {

		Participante entity = new Participante();

		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setIdioma(dto.getIdioma());
		entity.setIdade(dto.getIdade());
	

		Palpite palpite = palpiterepository.getReferenceById(dto.getTimeId());
		entity.setPalpites(palpite);

		entity = participanterepository.save(entity);
		return new PalpiteDTO(entity);

	}

}