package ge.edu.currency.service.impl;

public interface CurrencyService {
    void setExchangeRate(int integrRate);
    double convert(int amount);
    double convert(double amount);
}
