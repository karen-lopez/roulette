package com.karen.roulette.persistence.crud;

import com.karen.roulette.persistence.entity.Bet;
import com.karen.roulette.persistence.entity.Roulette;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BetCrudRepository extends CrudRepository<Bet,Integer> {
    @Query(value = "SELECT b FROM bets b WHERE b.bet_id = :betId", nativeQuery = true)
    public Optional<Bet> findById(@Param("betId") Integer betId);
    @Query(value = "SELECT b FROM bets b WHERE b.roulette_id = :rouletteId", nativeQuery = true)
    public List<Bet> findByRouletteId(@Param("rouletteId") Integer rouletteId);
    @Modifying
    @Query(value ="insert into bets (roulette_id, bet_option_id, user_id, money) values (:rouletteId, :betOptionId, :userId, :money)",
            nativeQuery = true)
    void insertBet(@Param("rouletteId") Integer rouletteId, @Param("betOptionId") Integer betOptionId,
                        @Param("userId") String userId, @Param("money") Integer money);
}
