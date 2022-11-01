package com.projeto.palpite.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.palpite.Services.PalpiteService;
import com.projeto.palpite.dto.PalpiteDTO;
import com.projeto.palpite.dto.PalpiteInsertDTO;

@RestController
@RequestMapping(value = "/palpite")
public class PalpiteResource {

	@Autowired
	private PalpiteService service;

	@PostMapping
	public ResponseEntity<PalpiteDTO> insert(@RequestBody PalpiteInsertDTO DTO){
		PalpiteDTO newDTO = service.insert(DTO);
		return ResponseEntity.ok().body(newDTO);
		
		
	}
}
