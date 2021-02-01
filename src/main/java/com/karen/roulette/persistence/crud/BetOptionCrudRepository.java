package com.karen.roulette.persistence.crud;

import com.karen.roulette.persistence.entity.Bet;
import com.karen.roulette.persistence.entity.BetOption;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BetOptionCrudRepository extends CrudRepository<BetOption, Integer> {
    @Query(value = "SELECT bo FROM bet_options bo WHERE bo.bet_option_id = :betOptionId", nativeQuery = true)
    public Optional<BetOption> findById(@Param("betOptionId") Integer betOptionId);
    @Query(value = "SELECT bo FROM bet_options bo WHERE bo.color = :color", nativeQuery = true)
    public List<BetOption> findByColor(@Param("color") Integer color);
    @Query(value = "SELECT bo FROM bet_options bo WHERE bo.number = :number", nativeQuery = true)
    public List<BetOption> findByNumber(@Param("number") Integer number);
}
