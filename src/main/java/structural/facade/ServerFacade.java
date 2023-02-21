package structural.facade;

public class ServerFacade {

    private final Server server;

    public ServerFacade(Server server) {
        this.server = server;
    }

    public void startSever() {
        server.boot();
        server.readSystemConfigs();
        server.init();
        server.initializeContext();
    }

    public void stopSever() {
        server.releaseProcesses();
        server.destroy();
        server.destroyContext();
        server.shutdown();
    }

}
