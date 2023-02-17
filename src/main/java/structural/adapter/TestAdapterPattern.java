package structural.adapter;

public class TestAdapterPattern {

    public static void main(String[] args) {
        Payable paypalPayment = new PaypalPayment();
        System.out.println(paypalPayment.pay());

        IndianCurrencyPaymentAdapter indianPaymentAdapter = new IndianCurrencyPaymentAdapterImpl(paypalPayment);
        System.out.println(indianPaymentAdapter.pay());
    }

}
