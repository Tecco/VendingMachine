package com.funnythingz.vendingmachine.domain;

public class Soda extends Drink {

    public Soda(DrinkName drinkName) {
        super(new DrinkName(drinkName.getValue()));
    }

    @Override
    public DrinkName getDrinkName() {
        return new DrinkName("ソーダ");
    }
}
