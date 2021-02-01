package com.karen.roulette.web.controller;

import com.karen.roulette.domain.BetDomain;
import com.karen.roulette.domain.RouletteDmain;
import com.karen.roulette.domain.service.BetService;
import com.karen.roulette.domain.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bets")
public class BetController {
    @Autowired
    private BetService betService;
    @Autowired
    private RouletteService rouletteService;

    @GetMapping("/roulette/{idRoulette}")
    public Optional<RouletteDmain> getRoulette(@PathVariable("idRoulette") Integer idRoulette){
        return rouletteService.getById(idRoulette);
    }

    @GetMapping("/addroulette/{idRoulette}")
    public boolean addRoulette(@PathVariable("idRoulette") Integer idRoulette){
        return rouletteService.setRoulette(idRoulette);
    }

    @GetMapping("/{idBet}")
    public Optional<BetDomain> getBet(@PathVariable("idBet") Integer idBet){
        return betService.getById(idBet);
    }

    @GetMapping("/rouletteId/{rouletteId}")
    public Optional<List<BetDomain>> getBetsOfRoulette(@PathVariable("rouletteId") Integer rouletteId){
        return betService.getByRouletteId(rouletteId);
    }
    @PostMapping("/createBet")
    public boolean addBet(@RequestBody BetDomain bet){
        return betService.setBet(bet);
    }
}
