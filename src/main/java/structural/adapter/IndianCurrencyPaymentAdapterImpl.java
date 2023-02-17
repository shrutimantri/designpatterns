package structural.adapter;

public class IndianCurrencyPaymentAdapterImpl implements IndianCurrencyPaymentAdapter {

    private Payable paypalPayment;

    public IndianCurrencyPaymentAdapterImpl(Payable paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    @Override
    public double pay() {
        return paypalPayment.pay() * 80;
    }

}
