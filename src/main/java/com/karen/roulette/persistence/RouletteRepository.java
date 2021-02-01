package com.karen.roulette.persistence;

import com.karen.roulette.persistence.crud.RouletteCrudRepository;
import com.karen.roulette.persistence.entity.Roulette;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RouletteRepository {
    private RouletteCrudRepository rouletteCrudRepository;

    public List<Roulette> getAll(){
        return rouletteCrudRepository.findAll();
    }

    public Optional<Roulette> getById(Integer rouletteId){
        return rouletteCrudRepository.findById(rouletteId);
    }

    public int setWinningNumber(Integer rouletteId, Integer winningNumber){
        return rouletteCrudRepository.updateRouletteSetWinningNumberForId(winningNumber, rouletteId);
    }

    public void setRoulette(Integer rouletteId, boolean available){
        rouletteCrudRepository.insertRoulette(rouletteId, available);
    }
}
