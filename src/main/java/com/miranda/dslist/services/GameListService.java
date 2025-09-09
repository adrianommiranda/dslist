package com.miranda.dslist.services;

import com.miranda.dslist.dtos.GameDTO;
import com.miranda.dslist.dtos.GameListDTO;
import com.miranda.dslist.dtos.GameMinDTO;
import com.miranda.dslist.entities.Game;
import com.miranda.dslist.entities.GameList;
import com.miranda.dslist.repositories.GameListRepository;
import com.miranda.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    //Listando todos os Games reduzidos
    @Transactional(readOnly = true)//Não vou fazer nenhuma operação de escrita
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();


        //return result.stream().map(x -> new GameMinDTO(x)).toList();
    }



}
