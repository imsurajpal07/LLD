package Structural.Bridge.PaymentGatewaySystem;

import Structural.Bridge.PaymentGatewaySystem.Abstraction.PaymentProcessor;
import Structural.Bridge.PaymentGatewaySystem.ConcreteImplementors.PaypalPaymentGateway;
import Structural.Bridge.PaymentGatewaySystem.ConcreteImplementors.StripePaymentGateway;
import Structural.Bridge.PaymentGatewaySystem.RefinedAbstraction.OnlineStorePaymentProcessor;
import Structural.Bridge.PaymentGatewaySystem.RefinedAbstraction.SubscriptionPaymentProcessor;

public class PaymentProcessorClient {
    public static void main(String[] args) {

        PaymentProcessor onlineStorePaymentProcessor = new OnlineStorePaymentProcessor(new PaypalPaymentGateway());
        PaymentProcessor subscriptionPaymentProcessor = new SubscriptionPaymentProcessor(new StripePaymentGateway());
        onlineStorePaymentProcessor.doPayment(100);
        subscriptionPaymentProcessor.doPayment(200);
        onlineStorePaymentProcessor.doRefund(100);
        subscriptionPaymentProcessor.doRefund(200);
    }
}
