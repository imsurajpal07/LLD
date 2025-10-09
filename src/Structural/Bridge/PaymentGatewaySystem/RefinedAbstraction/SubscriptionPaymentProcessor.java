package Structural.Bridge.PaymentGatewaySystem.RefinedAbstraction;

import Structural.Bridge.PaymentGatewaySystem.Abstraction.PaymentProcessor;
import Structural.Bridge.PaymentGatewaySystem.Implementor.PaymentGateway;

public class SubscriptionPaymentProcessor extends PaymentProcessor {
    public SubscriptionPaymentProcessor(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void doPayment(int amount) {
        System.out.println("[Subscription] Monthly charge initiated...");
        getPaymentGateway().pay(amount);
        System.out.println("[Subscription] Charge successful.\n");
    }

    @Override
    public void doRefund(int paymentId) {
        System.out.println("[Subscription] Processing subscription refund...");
        getPaymentGateway().refund(paymentId);
        System.out.println("[Subscription] Refund processed.\n");
    }
}
