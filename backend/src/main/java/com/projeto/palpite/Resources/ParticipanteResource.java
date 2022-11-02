package com.projeto.palpite.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.palpite.Services.ParticipanteService;
import com.projeto.palpite.dto.ParticipanteDTO;
import com.projeto.palpite.dto.ParticipanteInsertDTO;

@RestController
@RequestMapping(value = "/participante")
public class ParticipanteResource {

	@Autowired
	private ParticipanteService service;

	@PostMapping
	public ResponseEntity<ParticipanteDTO> insert(@RequestBody ParticipanteInsertDTO DTO) {
		ParticipanteDTO newDTO = service.insert(DTO);

		return ResponseEntity.ok().body(newDTO);

	}
}
