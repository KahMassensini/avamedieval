package com.avanade.avamedieval.loader;

import com.avanade.avamedieval.model.GameModel;
import com.avanade.avamedieval.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class GameLoader {
    @Autowired
    private GameRepository gameRepository;


    public void run(ApplicationArguments args) {

        //personagens herois
        gameRepository.save(new GameModel(1L, "Guerreiro", 20, 7, 5, 6, 1, 12));
        gameRepository.save(new GameModel(2L, "Bárbaro", 21, 10, 2, 5, 2, 8));
        gameRepository.save(new GameModel(3L, "Cavaleiro", 26, 6, 8, 3, 2, 6));

        //personagens monstros
        gameRepository.save(new GameModel(4L, "Orc", 42, 7, 1, 2, 3, 4));
        gameRepository.save(new GameModel(5L, "Gigante", 34, 10, 4, 4, 2, 6));
        gameRepository.save(new GameModel(6L, "Lobisomen", 34, 7, 4, 7, 2, 4));
    }
}
