package functional.state;

public class DeliveredState implements OrderState {

    @Override
    public void next(FoodOrder order) {
        System.out.println("This order is received by the customer.");
    }

    @Override
    public void prev(FoodOrder order) {
        order.setState(new PickupState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order delivered to the customer.");
    }

}
