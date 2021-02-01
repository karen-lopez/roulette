package com.karen.roulette.domain.repository;

import com.karen.roulette.persistence.entity.Bet;

import java.util.List;
import java.util.Optional;

public interface BetRepository {
    Optional<Bet> getById(Integer betId);
    List<Bet> getByRouletteId(Integer rouletteId);
    void setBet(Bet bet);
}
