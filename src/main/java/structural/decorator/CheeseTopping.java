package structural.decorator;

public class CheeseTopping extends PizzaDecorator {

    private final Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20;
    }

}
