package com.mauriciolourenco.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauriciolourenco.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
