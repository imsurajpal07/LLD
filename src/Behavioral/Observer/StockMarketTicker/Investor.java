package Behavioral.Observer.StockMarketTicker;

public class Investor implements IInvestor {

    private final String investorName;

    public Investor(String investorName) {
        this.investorName = investorName;
    }

    public String getInvestorName() {
        return investorName;
    }

    @Override
    public void update(String marketName, int price, String stockName) {
        System.out.println(marketName + " Notified to : " + investorName + " updated stock price of " + stockName + " is: " + price);
    }

    public void subscribe(StockMarket market, String stock) {
        market.registerInvestor(stock, this);
        System.out.printf("%s subscribed to %s%n", investorName, stock);
    }

    public void unsubscribe(StockMarket market, String stock) {
        market.removeInvestor(stock, this);
        System.out.printf("%s unsubscribed from %s%n", investorName, stock);
    }
}
