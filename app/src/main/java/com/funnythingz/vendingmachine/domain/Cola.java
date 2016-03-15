package com.funnythingz.vendingmachine.domain;

public class Cola extends Drink {

    public Cola(DrinkName drinkName) {
        super(new DrinkName(drinkName.getValue()));
    }

    @Override
    public DrinkName getDrinkName() {
        return new DrinkName("コーラ");
    }
}
