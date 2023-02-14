package creational.builder;

public class SedanCarBuilder implements CarBuilder {

    private final Car car = new Car("SEDAN");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("Sedan Body Style");
    }

    @Override
    public void buildPower() {
        car.setPower("200 hp");
    }

    @Override
    public void buildEngine() {
        car.setEngine("3L");
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("Gas");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
