package Behavioral.Observer.StockMarketTicker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket implements IStockMarket {
    private final String marketName;
    private final Map<String, List<IInvestor>> observers;
    private Map<String, Integer> stockPrices;

    public StockMarket(String marketName) {
        this.marketName = marketName;
        this.observers = new HashMap<>();
        this.stockPrices = new HashMap<>();
    }

    public void setStockPrices(Map<String, Integer> stockPrices) {
        this.stockPrices = stockPrices;
    }

    public String getMarketName() {
        return marketName;
    }

    @Override
    public void registerInvestor(String stockName, IInvestor observer) {
        observers.computeIfAbsent(stockName, k -> new ArrayList<>()).add(observer);
    }

    @Override
    public void removeInvestor(String stockName, IInvestor observer) {
        List<IInvestor> investorList = observers.get(stockName);
        if (investorList != null) {
            investorList.remove(observer);
        }
    }

    @Override
    public void notifyInvestors(String stockName, int price) {
        List<IInvestor> investorList = observers.get(stockName);
        if (investorList != null) {
            investorList.forEach(iInvestor -> iInvestor.update(this.marketName,price, stockName));
        }
    }

    public void updateStockPrice(String stockName, int stockPrice) {
        if (stockPrices.containsKey(stockName)) {
            stockPrices.put(stockName, stockPrice);
            notifyInvestors(stockName, stockPrice);
        }
    }
}
