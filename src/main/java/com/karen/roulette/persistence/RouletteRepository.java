package com.karen.roulette.persistence;

import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.domain.repository.RouletteRepositoryDomain;
import com.karen.roulette.persistence.crud.BetCrudRepository;
import com.karen.roulette.persistence.crud.RouletteCrudRepository;
import com.karen.roulette.persistence.entity.Roulette;
import com.karen.roulette.persistence.mapper.BetMapper;
import com.karen.roulette.persistence.mapper.RouletteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RouletteRepository implements RouletteRepositoryDomain {
    @Autowired
    private RouletteCrudRepository rouletteCrudRepository;
    @Autowired
    private RouletteMapper mapper;

    public List<RouletteDmain> getAll(){
        return mapper.toRouletteDmains(rouletteCrudRepository.findAll());
    }

    public Optional<RouletteDmain> getById(Integer rouletteId){
        return rouletteCrudRepository.findById(rouletteId).map(roulette -> mapper.toRouletteDmain(roulette));
    }

    public int setWinningNumber(Integer rouletteId, Integer winningNumber){
        return rouletteCrudRepository.updateRouletteSetWinningNumberForId(winningNumber, rouletteId);
    }

    public void setRoulette(RouletteDmain roulette){
        rouletteCrudRepository.insertRoulette(roulette.getRouletteId(), roulette.isAvailable());
    }
}
