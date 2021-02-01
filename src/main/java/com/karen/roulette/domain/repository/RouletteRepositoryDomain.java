package com.karen.roulette.domain.repository;

import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.persistence.entity.Roulette;

import java.util.List;
import java.util.Optional;

public interface RouletteRepositoryDomain {
    List<RouletteDmain> getAll();
    Optional<RouletteDmain> getById(Integer rouletteId);
    int setWinningNumber(Integer rouletteId, Integer winningNumber);
    void setRoulette(RouletteDmain roulette);
}
