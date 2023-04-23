package functional.state;

public class PickupState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void prev(FoodOrder order) {
        order.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order picked up from restaurant, not received by customer yet.");
    }

}
