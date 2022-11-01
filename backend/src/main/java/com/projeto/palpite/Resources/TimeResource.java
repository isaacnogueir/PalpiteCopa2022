package com.projeto.palpite.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.palpite.Services.TimeService;
import com.projeto.palpite.dto.TimeDTO;

@RestController
@RequestMapping(value = "/times")
public class TimeResource {

	@Autowired
	private TimeService service;

	@GetMapping
	public ResponseEntity<List<TimeDTO>> findAll() {
		List<TimeDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
