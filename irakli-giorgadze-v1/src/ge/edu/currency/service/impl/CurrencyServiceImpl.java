package ge.edu.currency.service.impl;

public class CurrencyServiceImpl {
    double exchangeRate = setExchangeRate(3.12);
    @Override
    public double setExchangeRate(double exchangeRate){
        return exchangeRate;
    }
    public int convert (int amount) {return (int)(amount/exchangeRate);}
    public double convert(double amount){return amount/exchangeRate;}
}
