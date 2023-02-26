package structural.proxy;

public class TestProxyPattern {

    public static void main(String[] args) {
        ProxyInternetAccess proxyInternetAccess = new ProxyInternetAccess(new InternetAccessImpl());
        proxyInternetAccess.grantInternetAccess();
    }

}
