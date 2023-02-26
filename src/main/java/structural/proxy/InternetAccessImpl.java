package structural.proxy;

public class InternetAccessImpl implements InternetAccess {

    @Override
    public void grantInternetAccess() {
        System.out.println("Granting internet access");
    }

}
