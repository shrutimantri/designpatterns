package functional.template;

public class TestTemplatePattern {

    public static void main(String[] args) {
        System.out.println("Postgres connection start....");
        ConnectionTemplate template = new PostgresDbConnection();
        template.run();
        System.out.println("Postgres connection end....");
        System.out.println("Oracle connection start...");
        template = new OracleDbConnection();
        template.run();
        System.out.println("Postgres connection end....");
    }

}
