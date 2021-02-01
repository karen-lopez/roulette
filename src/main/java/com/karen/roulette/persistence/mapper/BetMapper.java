package com.karen.roulette.persistence.mapper;

import com.karen.roulette.domain.BetDomain;
import com.karen.roulette.persistence.entity.Bet;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface BetMapper {
    @Mappings({
            @Mapping(source = "betId", target = "betId"),
            @Mapping(source = "rouletteId", target = "rouletteId"),
            @Mapping(source = "betOptionId", target = "optionId"),
            @Mapping(source = "money", target = "money"),
            @Mapping(source = "userId", target = "user"),
    })
    BetDomain toBet(Bet bet);

    @InheritInverseConfiguration
    Bet toBetDomain(BetDomain betDomain);

}
