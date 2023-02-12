package creational.abstractfactory;

public class MercedesSportsEngine implements VehicleEngine {

    @Override
    public void start() {
        System.out.println("Mercedes Sports Engine started..");
    }

    @Override
    public String getInformation() {
        return "Mercedes Sports Engine Information";
    }

}
