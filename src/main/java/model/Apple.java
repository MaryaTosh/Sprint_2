package model;

import model.constants.Colour;
import model.constants.Discount;

import static model.constants.Colour.red;
import static model.constants.Colour.green;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour == red) {
            return Discount.standart;
        } else return Discount.standart;
    }
}
