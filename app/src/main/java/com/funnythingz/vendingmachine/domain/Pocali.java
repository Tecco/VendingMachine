package com.funnythingz.vendingmachine.domain;

public class Pocali extends Drink {

    public Pocali(DrinkName drinkName) {
        super(new DrinkName(drinkName.getValue()));
    }

    @Override
    public DrinkName getDrinkName() {
        return new DrinkName("ポカリ");
    }
}
