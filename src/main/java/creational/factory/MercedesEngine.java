package creational.factory;

public class MercedesEngine implements VehicleEngine {

    @Override
    public void start() {
        System.out.println("Mercedes Engine started..");
    }

    @Override
    public String getInformation() {
        return "Mercedes Engine Information";
    }

}
