package structural.facade;

public class TestFacadePattern {

    public static void main(String[] args) {
        Server server = new Server();
        ServerFacade serverFacade = new ServerFacade(server);
        System.out.println("****Starting****");
        serverFacade.startSever();
        System.out.println("****Stopping****");
        serverFacade.stopSever();
    }

}
