package creational.builder;

public class CarDirector {

    private final CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build() {
        carBuilder.buildBodyStyle();
        carBuilder.buildEngine();
        carBuilder.buildPower();
        carBuilder.buildFuelType();
    }

}
