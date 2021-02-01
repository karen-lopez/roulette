package com.karen.roulette.persistence.mapper;

import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.persistence.entity.Roulette;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RouletteMapper {
    @Mappings({
            @Mapping(source = "rouletteId", target = "rouletteId"),
            @Mapping(source = "winningNumber", target = "winnigNumber"),
            @Mapping(source = "available", target = "available"),
    })
    RouletteDmain toRouletteDmain(Roulette roulette);
    List<RouletteDmain> toRouletteDmains(List<Roulette> roulette);

    @InheritInverseConfiguration
    Roulette toRoulette(RouletteDmain rouletteDmain);

}
