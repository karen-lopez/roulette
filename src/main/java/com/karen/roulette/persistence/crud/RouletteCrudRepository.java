package com.karen.roulette.persistence.crud;

import com.karen.roulette.persistence.entity.Roulette;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RouletteCrudRepository extends CrudRepository<Roulette, Integer> {
    @Query(value = "SELECT r FROM roulettes r", nativeQuery = true)
    public List<Roulette> findAll();
    @Query(value = "SELECT r FROM roulettes r WHERE r.roulette_id = :rouletteId", nativeQuery = true)
    public Optional<Roulette> findById(@Param("rouletteId") Integer rouletteId);
    @Modifying
    @Query(value = "UPDATE roulettes r SET r.winning_number = :winningNumber WHERE r.roulette_id = :rouletteId",
            nativeQuery = true)
    int updateRouletteSetWinningNumberForId(@Param("winningNumber") Integer winningNumber, @Param("rouletteId") Integer rouletteId);
    @Modifying
    @Query(value ="insert into bet_options (roulette_id, available) values (:rouletteId, :available)",
            nativeQuery = true)
    void insertRoulette(@Param("rouletteId") Integer rouletteId, @Param("available") boolean available);
}
