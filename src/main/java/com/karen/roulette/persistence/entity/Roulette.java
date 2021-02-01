package com.karen.roulette.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "roulette")
public class Roulette {
    @Id
    @Column(name = "roulette_id")
    private Integer rouletteId;
    @Column(name = "winning_number")
    private Integer winningNumber;
    @Column(name = "available")
    private boolean available;

    public Integer getRouletteId() {
        return rouletteId;
    }

    public void setRouletteId(Integer rouletteId) {
        this.rouletteId = rouletteId;
    }

    public Integer getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(Integer winningNumber) {
        this.winningNumber = winningNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
