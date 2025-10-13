package Behavioral.Observer.StockMarketTicker;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        StockMarket BSE = new StockMarket("BSE");
        StockMarket NSE = new StockMarket("NSE");

        Map<String, Integer> bsePrices = new HashMap<>(Map.of(
                "RELIANCE", 100,
                "INFY", 100,
                "TATASTEEL", 100
        ));
        BSE.setStockPrices(bsePrices);

        Map<String, Integer> nsePrices = new HashMap<>(Map.of(
                "RELIANCE", 100,
                "INFY", 100,
                "TATASTEEL", 100
        ));
        NSE.setStockPrices(nsePrices);


        Investor suraj = new Investor("Suraj");
        Investor sayan = new Investor("Sayan");
        Investor subham = new Investor("Subham");
        Investor amit = new Investor("Amit");


        suraj.subscribe(BSE, "RELIANCE");
        sayan.subscribe(BSE, "RELIANCE");
        subham.subscribe(NSE, "INFY");
        amit.subscribe(NSE, "TATASTEEL");

        // Simulate stock price updates
        BSE.updateStockPrice("RELIANCE", 2500);
        BSE.updateStockPrice("RELIANCE", 2520);
        BSE.updateStockPrice("RELIANCE", 2600);
        NSE.updateStockPrice("INFY", 1500);
        NSE.updateStockPrice("INFY", 1535);
        BSE.updateStockPrice("TATASTEEL", 1200);
        NSE.updateStockPrice("TATASTEEL", 1250);


    }
}
