package structural.decorator;

public class BlackOlives extends PizzaDecorator {

    private final Pizza pizza;

    public BlackOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Black Olives";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 10;
    }

}
