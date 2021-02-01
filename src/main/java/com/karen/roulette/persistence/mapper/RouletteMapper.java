package com.karen.roulette.persistence.mapper;

import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.persistence.entity.Roulette;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RouletteMapper {
    @Mappings({
            @Mapping(source = "rouletteId", target = "rouletteId"),
            @Mapping(source = "winningNumber", target = "winnigNumber"),
            @Mapping(source = "available", target = "available"),
    })
    RouletteDmain toRoulette(Roulette roulette);

    @InheritInverseConfiguration
    Roulette toRouletteDmain(RouletteDmain rouletteDmain);
}
