package creational.builder;

public interface CarBuilder {

    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildFuelType();
    Car getCar();

}
