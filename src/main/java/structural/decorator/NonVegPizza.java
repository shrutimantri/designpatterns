package structural.decorator;

public class NonVegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "Non Veg Pizza";
    }

    @Override
    public double getPrice() {
        return 120;
    }

}
