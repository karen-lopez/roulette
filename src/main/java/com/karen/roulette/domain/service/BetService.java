package com.karen.roulette.domain.service;

import com.karen.roulette.domain.BetDomain;
import com.karen.roulette.domain.repository.BetRepositoryDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BetService {
    @Autowired
    private BetRepositoryDomain betRepository;

    public Optional<BetDomain> getById(Integer idBet){
        return betRepository.getById(idBet);
    }

    public Optional<List<BetDomain>> getByRouletteId(Integer rouletteId){
        return betRepository.getByRouletteId(rouletteId);
    }

    public boolean setBet(BetDomain bet){
        betRepository.setBet(bet);
        if(getById(bet.getBetId()).isPresent()) return true;
        else return false;
    }

}
