package com.projeto.palpite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.palpite.entities.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long>{

}
