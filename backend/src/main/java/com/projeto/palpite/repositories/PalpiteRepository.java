package com.projeto.palpite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.palpite.entities.Palpite;

@Repository
public interface PalpiteRepository extends JpaRepository<Palpite, Long> {

}
