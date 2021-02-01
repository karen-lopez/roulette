package com.karen.roulette.persistence.mapper;

import com.karen.roulette.domain.BetDomain;
import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.persistence.entity.Bet;
import com.karen.roulette.persistence.entity.Roulette;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {RouletteMapper.class})
public interface BetMapper {
    @Mappings({
            @Mapping(source = "betId", target = "betId"),
            @Mapping(source = "rouletteId", target = "rouletteId"),
            @Mapping(source = "betOptionId", target = "optionId"),
            @Mapping(source = "money", target = "money"),
            @Mapping(source = "userId", target = "user"),
    })
    BetDomain toBetDomain(Bet bet);
    List<BetDomain> toBets(List<Bet> bet);

    @InheritInverseConfiguration
    Bet toBet(BetDomain betDomain);

}
