package com.karen.roulette.domain.service;

import com.karen.roulette.domain.BetDomain;
import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.domain.repository.BetRepositoryDomain;
import com.karen.roulette.domain.repository.RouletteRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouletteService {
    @Autowired
    private RouletteRepositoryDomain rouletteRepository;

    public Optional<RouletteDmain> getById(Integer idRoulette){
        return rouletteRepository.getById(idRoulette);
    }

    public List<RouletteDmain> getAllRoulettes(){
        return rouletteRepository.getAll();
    }
    public int setWinningNumber(Integer rouletteId, Integer winningNumber){
        return rouletteRepository.setWinningNumber(rouletteId, winningNumber);
    }

    public boolean setRoulette(Integer idRoulette){
        RouletteDmain roulette = new RouletteDmain();
        roulette.setRouletteId(idRoulette);
        roulette.setAvailable(false);
        rouletteRepository.setRoulette(roulette);
        if(getById(roulette.getRouletteId()).isPresent()) return true;
        else return false;
    }
}
