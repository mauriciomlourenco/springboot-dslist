package com.mauriciolourenco.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauriciolourenco.dslist.dto.GameDTO;
import com.mauriciolourenco.dslist.dto.GameListDTO;
import com.mauriciolourenco.dslist.dto.GameMinDTO;
import com.mauriciolourenco.dslist.entities.Game;
import com.mauriciolourenco.dslist.repositories.GameListRepository;
import com.mauriciolourenco.dslist.repositories.GameRepository;



@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;   
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        var result =gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
