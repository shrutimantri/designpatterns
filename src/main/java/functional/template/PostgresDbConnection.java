package functional.template;

public class PostgresDbConnection extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Setting POSTGRES DB drivers...");
    }
    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for POSTGRES DB...");
    }
    @Override
    public void setData() {
        System.out.println("Setting up data into POSTGRES DB....");
    }

}
