package model;
import model.constants.*;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return Discount.standart;
    }
    public double getPrice(){
        return price;
    }
    public int getAmount() {
        return amount;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
}