package com.avanade.avamedieval.repository;

import com.avanade.avamedieval.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Long> {

}
