package com.miranda.dslist;

import com.miranda.dslist.dtos.GameMinDTO;
import com.miranda.dslist.entities.Game;
import com.miranda.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

        //return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
