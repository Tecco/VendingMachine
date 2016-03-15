package com.funnythingz.vendingmachine.domain;

public class Fanta extends Drink {

    public Fanta(DrinkName drinkName) {
        super(new DrinkName(drinkName.getValue()));
    }

    @Override
    public DrinkName getDrinkName() {
        return new DrinkName("ファンタ");
    }
}
