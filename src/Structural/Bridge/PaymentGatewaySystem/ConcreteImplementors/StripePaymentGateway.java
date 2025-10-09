package Structural.Bridge.PaymentGatewaySystem.ConcreteImplementors;

import Structural.Bridge.PaymentGatewaySystem.Implementor.PaymentGateway;

public class StripePaymentGateway implements PaymentGateway {
    @Override
    public void pay(int amount) {
        System.out.println("Payment successfully done of amount: " + amount + " by stripe gateway.");
    }

    @Override
    public void refund(int paymentId) {
        System.out.println("refund successfully done for id: " + paymentId + " by stripe gateway.");
    }
}
