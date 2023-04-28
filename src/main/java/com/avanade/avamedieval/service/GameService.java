package com.avanade.avamedieval.service;

import com.avanade.avamedieval.model.GameModel;
import com.avanade.avamedieval.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired

    private GameRepository repository;

    //create
    public GameModel create(GameModel gameModel) {

        return this.repository.save(gameModel);
    }

    //read
    public List<GameModel> findAll() {
        return repository.findAll();
    }

    //update
    public GameModel update(GameModel gameModel) {

        return repository.save(gameModel);
    }

    //delete
    public void delete(GameModel gameModel) {

        repository.delete(gameModel);
    }

    //dado
    private Integer dado(Integer qtd, Integer face) {
        Integer soma = 0;
        for (int i = 0; i < qtd; i++) {
            soma += (int) (Math.random() * face);
        }

        return soma;
    }
}
