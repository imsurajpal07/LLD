package Structural.Bridge.PaymentGatewaySystem.Abstraction;

import Structural.Bridge.PaymentGatewaySystem.Implementor.PaymentGateway;

public abstract class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public abstract void doPayment(int amount);

    public abstract void doRefund(int paymentId);

}
