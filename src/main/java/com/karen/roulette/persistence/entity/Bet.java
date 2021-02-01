package com.karen.roulette.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "bets")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bet_id")
    private Integer betId;
    @Column(name = "roulette_id")
    private Integer rouletteId;
    @Column(name = "bet_option_id")
    private Integer betOptionId;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "money")
    private Integer money;

    public Integer getBetId() {
        return betId;
    }

    public void setBetId(Integer betId) {
        this.betId = betId;
    }

    public Integer getRouletteId() {
        return rouletteId;
    }

    public void setRouletteId(Integer rouletteId) {
        this.rouletteId = rouletteId;
    }

    public Integer getBetOptionId() {
        return betOptionId;
    }

    public void setBetOptionId(Integer betOptionId) {
        this.betOptionId = betOptionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
