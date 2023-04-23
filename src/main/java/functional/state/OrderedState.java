package functional.state;

public class OrderedState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        order.setState(new PickupState());
    }

    @Override
    public void prev(FoodOrder pkg) {
        System.out.println("The order is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Food order ordered, not delivered to the customer yet.");
    }

}
