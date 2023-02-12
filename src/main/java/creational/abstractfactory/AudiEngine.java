package creational.abstractfactory;

public class AudiEngine implements VehicleEngine {

    @Override
    public void start() {
        System.out.println("Audi Engine started..");
    }

    @Override
    public String getInformation() {
        return "Audi Engine Information";
    }

}
