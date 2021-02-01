package com.karen.roulette.domain.repository;


import com.karen.roulette.domain.BetDomain;

import java.util.List;
import java.util.Optional;

public interface BetRepositoryDomain {
    Optional<BetDomain> getById(Integer betId);
    Optional<List<BetDomain>> getByRouletteId(Integer rouletteId);
    void setBet(BetDomain bet);
}
