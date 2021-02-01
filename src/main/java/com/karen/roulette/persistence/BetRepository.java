package com.karen.roulette.persistence;

import com.karen.roulette.domain.BetDomain;
import com.karen.roulette.domain.repository.BetRepositoryDomain;
import com.karen.roulette.persistence.crud.BetCrudRepository;
import com.karen.roulette.persistence.entity.Bet;
import com.karen.roulette.persistence.mapper.BetMapper;
import com.karen.roulette.persistence.mapper.RouletteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BetRepository implements BetRepositoryDomain {
    @Autowired
    private BetCrudRepository betCrudRepository;
    @Autowired
    private BetMapper mapper;

    public Optional<BetDomain> getById(Integer betId){
        return betCrudRepository.findById(betId).map(bet -> mapper.toBetDomain(bet));
    }

    public Optional<List<BetDomain>> getByRouletteId(Integer rouletteId){
        List<Bet> bets = betCrudRepository.findByRouletteId(rouletteId);
        return Optional.of(mapper.toBets(bets));
    }

    @Override
    public void setBet(BetDomain betDomain){
        Bet bet = mapper.toBet(betDomain);
        betCrudRepository.insertBet(bet.getRouletteId(), bet.getBetOptionId(),
                bet.getUserId(), bet.getMoney());
    }
}
