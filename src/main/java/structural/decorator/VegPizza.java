package structural.decorator;

public class VegPizza implements Pizza {

    @Override
    public String getDesc() {
        return "Veg Pizza";
    }

    @Override
    public double getPrice() {
        return 100;
    }

}
