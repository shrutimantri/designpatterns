package structural.proxy;

public class ProxyInternetAccess implements InternetAccess {

    private final InternetAccessImpl internetAccess;

    public ProxyInternetAccess(InternetAccessImpl internetAccess) {
        this.internetAccess = internetAccess;
    }

    @Override
    public void grantInternetAccess() {
        if (hasInternetLevel()) {
            internetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access granted.");
        }
    }

    private boolean hasInternetLevel() {
        // Get actual access definition of employee
        return true;
    }

}
