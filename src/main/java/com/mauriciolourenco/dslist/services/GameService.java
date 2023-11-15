package com.mauriciolourenco.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mauriciolourenco.dslist.dto.GameDTO;
import com.mauriciolourenco.dslist.dto.GameMinDTO;
import com.mauriciolourenco.dslist.entities.Game;
import com.mauriciolourenco.dslist.repositories.GameRepository;



@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();

        GameDTO dto = new GameDTO(result);

        return dto;
    }    
    
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        var result =gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
