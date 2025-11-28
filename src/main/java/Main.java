import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100.00);
        Apple redApple = new Apple(10, 50.00, Colour.red);
        Apple greenApple = new Apple(8, 60.00, Colour.green);

        Food[] cart = {meat, redApple, greenApple};// массив продуктов, Food испл.потому что эти объекты определяются как Food

        ShoppingCart shoppingCart = new ShoppingCart(cart); //в классе ShoppingCart создавали конструктор, если нужно было указывать массив продуктов
        System.out.printf("Итоговая сумма без скидки: %.2f%n", shoppingCart.getTotal());
        System.out.printf("Итоговая сумма со скидкой: %.2f%n", shoppingCart.getTotalSumDiscount());
        System.out.printf("Итоговая сумма вегетарианский товаров: %.2f%n", shoppingCart.getSumVegetarian());
    }
}


