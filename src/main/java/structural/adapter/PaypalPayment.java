package structural.adapter;

public class PaypalPayment implements Payable {

    @Override
    public double pay() {
        return 100;
    }

}
