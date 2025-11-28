package service;
import model.Food;

public class ShoppingCart {
private Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }
public double getTotal() {  //используя цикл перебираем каждый объект класса Food, берем его цену и добалвяем к итоговой
double sum = 0.0;
for(Food item : items) {
    sum = sum + item.getPrice();
} return  sum;
}
public double getTotalSumDiscount(){
    double sum = 0.0;
    for (Food item : items) {
        double discount = item.getDiscount() / 100.0;
        double priceWithDiscount = item.getPrice() * (1 - discount);
        sum += priceWithDiscount * item.getAmount();
    }
    return sum;
}
public double getSumVegetarian() {
    double sum = 0.0;
    for (Food item : items) {
        if (item.isVegetarian()) {
            sum = sum + item.getPrice();
        }
    } return sum;
}
}
