package Behavioral.Observer.StockMarketTicker;

public interface IStockMarket {
    void registerInvestor(String stock, IInvestor observer);
    void removeInvestor(String stock, IInvestor observer);
    void notifyInvestors(String stock, int price);
}
