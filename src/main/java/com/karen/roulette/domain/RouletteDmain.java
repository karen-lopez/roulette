package com.karen.roulette.domain;

public class RouletteDmain {
    private int rouletteId;
    private boolean available;
    private int winnigNumber;

    public int getRouletteId() {
        return rouletteId;
    }

    public void setRouletteId(int rouletteId) {
        this.rouletteId = rouletteId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getWinnigNumber() {
        return winnigNumber;
    }

    public void setWinnigNumber(int winnigNumber) {
        this.winnigNumber = winnigNumber;
    }
}
