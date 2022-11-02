package com.projeto.palpite.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.palpite.dto.ParticipanteDTO;
import com.projeto.palpite.dto.ParticipanteInsertDTO;
import com.projeto.palpite.entities.Palpite;
import com.projeto.palpite.entities.Participante;
import com.projeto.palpite.repositories.PalpiteRepository;
import com.projeto.palpite.repositories.ParticipanteRepository;

@Service
public class ParticipanteService {

	@Autowired
	private ParticipanteRepository participanterepository;

	@Autowired
	private PalpiteRepository palpiterepository;

	@Transactional
	public ParticipanteDTO insert(ParticipanteInsertDTO dto) {

		Participante entity = new Participante();

		entity.setEmail(dto.getEmail());
		entity.setIdade(dto.getIdade());
		entity.setIdioma(dto.getIdioma());
		entity.setNome(dto.getNome());

		Palpite palpite = palpiterepository.getReferenceById(dto.getPalpite_id());
		entity.setPalpites(palpite);

		entity = participanterepository.save(entity);

		return new ParticipanteDTO(entity);

	}

}