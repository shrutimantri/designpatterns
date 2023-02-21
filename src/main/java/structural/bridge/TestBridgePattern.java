package structural.bridge;

public class TestBridgePattern {

    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        Shape circle = new Circle(new Blue());
        System.out.println(circle.draw());
    }

}
