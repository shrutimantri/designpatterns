package functional.template;

public class OracleDbConnection extends ConnectionTemplate {

    @Override
    public void setDBDriver() {
        System.out.println("Setting Oracle DB drivers...");
    }
    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for Oracle DB...");
    }
    @Override
    public void setData() {
        System.out.println("Setting up data into Oracle DB....");
    }

}
