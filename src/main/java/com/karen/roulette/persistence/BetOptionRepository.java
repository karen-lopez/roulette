package com.karen.roulette.persistence;

import com.karen.roulette.persistence.crud.BetOptionCrudRepository;
import com.karen.roulette.persistence.entity.BetOption;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BetOptionRepository {
    private BetOptionCrudRepository betOptionCrudRepository;

    public Optional<BetOption> getById(Integer betOptionId){
        return betOptionCrudRepository.findById(betOptionId);
    }

    public List<BetOption> getByColor(String color){
        return betOptionCrudRepository.findByColor(color);
    }


}
