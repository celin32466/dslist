package com.celo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
