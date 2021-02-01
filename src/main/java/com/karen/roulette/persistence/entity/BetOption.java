package com.karen.roulette.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "bet_options")
public class BetOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bet_option_id")
    private Integer betOptionId;
    @Column(name = "opcion")
    private String opcion;
    @Column(name = "color")
    private boolean color;

    public Integer getBetOptionId() {
        return betOptionId;
    }

    public void setBetOptionId(Integer betOptionId) {
        this.betOptionId = betOptionId;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
