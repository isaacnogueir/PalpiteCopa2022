package com.projeto.palpite.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.palpite.dto.TimeDTO;
import com.projeto.palpite.entities.Time;
import com.projeto.palpite.repositories.TimeRepository;

@Service
public class TimeService {

	@Autowired
	private TimeRepository repository;

	@Transactional(readOnly = true)
	public List<TimeDTO> findAll() {
		List<Time> list = repository.findAll();
		return list.stream().map(x -> new TimeDTO(x)).collect(Collectors.toList());
	}
}