package structural.facade;

public class Server {

    public void boot() {
        System.out.println("Booting server");
    }

    public void readSystemConfigs() {
        System.out.println("Reading system configurations");
    }

    public void init() {
        System.out.println("Initializing");
    }

    public void initializeContext() {
        System.out.println("Initialize context");
    }

    public void releaseProcesses() {
        System.out.println("Release processes");
    }

    public void destroy() {
        System.out.println("Destroying");
    }

    public void destroyContext() {
        System.out.println("Destroying context");
    }

    public void shutdown() {
        System.out.println("Shutting down");
    }

}
