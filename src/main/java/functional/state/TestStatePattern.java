package functional.state;

public class TestStatePattern {

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        order.setState(new OrderedState());
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
    }

}
