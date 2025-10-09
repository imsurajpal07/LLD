package Structural.Bridge.PaymentGatewaySystem.RefinedAbstraction;

import Structural.Bridge.PaymentGatewaySystem.Abstraction.PaymentProcessor;
import Structural.Bridge.PaymentGatewaySystem.Implementor.PaymentGateway;

public class OnlineStorePaymentProcessor extends PaymentProcessor {

    public OnlineStorePaymentProcessor(PaymentGateway paymentGateway) {
        super(paymentGateway);
    }

    @Override
    public void doPayment(int amount) {
        System.out.println("Starting payment for online store payment processor:");
        getPaymentGateway().pay(amount);
        System.out.println("Done payment for online store payment processor:");
    }

    @Override
    public void doRefund(int paymentId) {
        System.out.println("Starting refund for online store payment processor:");
        getPaymentGateway().refund(paymentId);
        System.out.println("Done refund for online store payment processor:");
    }
}
