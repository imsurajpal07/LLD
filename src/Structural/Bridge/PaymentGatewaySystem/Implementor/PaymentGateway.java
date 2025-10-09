package Structural.Bridge.PaymentGatewaySystem.Implementor;

public interface PaymentGateway {

    public void pay(int amount);

    public void refund(int paymentId);
}
