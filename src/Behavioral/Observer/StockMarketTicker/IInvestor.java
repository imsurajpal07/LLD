package Behavioral.Observer.StockMarketTicker;

public interface IInvestor {

    public void update(String marketName,int price, String stockName);
}
