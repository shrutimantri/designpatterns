package creational.builder;

public class SportsCarBuilder implements CarBuilder {

    private final Car car = new Car("SPORTS");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("Sports Body Style");
    }

    @Override
    public void buildPower() {
        car.setPower("300 hp");
    }

    @Override
    public void buildEngine() {
        car.setEngine("4L");
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
