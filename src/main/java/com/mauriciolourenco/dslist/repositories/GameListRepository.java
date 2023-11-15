package com.mauriciolourenco.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauriciolourenco.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
