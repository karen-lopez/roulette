package com.karen.roulette.persistence;

import com.karen.roulette.persistence.crud.BetCrudRepository;
import com.karen.roulette.persistence.entity.Bet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BetRepository {
    private BetCrudRepository betCrudRepository;

    public Optional<Bet> getById(Integer betId){
        return betCrudRepository.findById(betId);
    }

    public List<Bet> getByRouletteId(Integer rouletteId){
        return betCrudRepository.findByRouletteId(rouletteId);
    }

    public void setBet(Integer rouletteId, Integer betOptionId, String userId, Integer money){
        betCrudRepository.insertBet(rouletteId, betOptionId, userId, money);
    }
}
