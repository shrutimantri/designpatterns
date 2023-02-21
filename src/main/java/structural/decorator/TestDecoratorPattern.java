package structural.decorator;

public class TestDecoratorPattern {

    public static void main(String[] args) {
        Pizza pizza = new CheeseTopping(new VegPizza());
        System.out.println("Desc: " + pizza.getDesc());
        System.out.println("Price: " + pizza.getPrice());

        Pizza nonVegPizza = new BlackOlives(new CheeseTopping(new NonVegPizza()));
        System.out.println("Desc: " + nonVegPizza.getDesc());
        System.out.println("Price: " + nonVegPizza.getPrice());
    }

}
