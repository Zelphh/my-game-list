package com.zelph.mygamelist.services;

import com.zelph.mygamelist.dto.GameListDTO;
import com.zelph.mygamelist.entities.GameList;
import com.zelph.mygamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result =gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
