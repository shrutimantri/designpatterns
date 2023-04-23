package functional.state;

public interface OrderState {

    void next(FoodOrder order);

    void prev(FoodOrder order);

    void printStatus();

}
