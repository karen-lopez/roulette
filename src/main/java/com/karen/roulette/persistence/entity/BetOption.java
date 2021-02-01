package com.karen.roulette.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "bet_options")
public class BetOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bet_option_id")
    private Integer betOptionId;
    @Column(name = "option")
    private String option;
    @Column(name = "color")
    private boolean color;

    public Integer getBetOptionId() {
        return betOptionId;
    }

    public void setBetOptionId(Integer betOptionId) {
        this.betOptionId = betOptionId;
    }

    public String getOption() {
        return option;
    }

    public void setOpcion(String option) {
        this.option = option;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
