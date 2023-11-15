package com.mauriciolourenco.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauriciolourenco.dslist.dto.GameDTO;
import com.mauriciolourenco.dslist.dto.GameListDTO;
import com.mauriciolourenco.dslist.dto.GameMinDTO;
import com.mauriciolourenco.dslist.services.GameListService;
import com.mauriciolourenco.dslist.services.GameService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameListDTO> findAll() {
        var result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable long listId) {
        var result = gameService.findByList(listId);
        return result;
    }
    
}
