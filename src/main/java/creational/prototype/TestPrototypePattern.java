package creational.prototype;

public class TestPrototypePattern {

    public static void main(String[] args) {
        Employee employee = new Employee("Name1", "Address1", 200);
        System.out.println(employee);

        Prototype clonedEmployee = employee.getClone();
        System.out.println(clonedEmployee);
    }

}
