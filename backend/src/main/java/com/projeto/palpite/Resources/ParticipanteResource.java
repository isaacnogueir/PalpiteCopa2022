package com.projeto.palpite.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping
	public ResponseEntity<Page<ParticipanteDTO>> findAll(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "0") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
			@RequestParam(value = "direction", defaultValue = "DESC") String direction) {

		if (linesPerPage == 0) {
			linesPerPage = Integer.MAX_VALUE;

		}

		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);

			Page<ParticipanteDTO> list = service.findbyNome(pageRequest);
			return ResponseEntity.ok().body(list);

		}
	}