package com.miranda.dslist;

import com.miranda.dslist.dtos.GameDTO;
import com.miranda.dslist.dtos.GameMinDTO;
import com.miranda.dslist.entities.Game;
import com.miranda.dslist.repositories.GameRepository;
//import jakarta.transaction.Transactional; errado
import org.springframework.transaction.annotation.Transactional; // Import CORRETO
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //Listando todos os Games reduzidos
    @Transactional(readOnly = true)//Não vou fazer nenhuma operação de escrita
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

        //return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    //Um game completo por pesquisa no id
    @Transactional(readOnly = true)//Não vou fazer nenhuma operação de escrita
    public GameDTO findbyId(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

}
