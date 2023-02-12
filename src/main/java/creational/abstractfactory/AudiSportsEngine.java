package creational.abstractfactory;

public class AudiSportsEngine implements VehicleEngine {

    @Override
    public void start() {
        System.out.println("Audi Sports Engine started..");
    }

    @Override
    public String getInformation() {
        return "Audi Sports Engine Information";
    }

}
