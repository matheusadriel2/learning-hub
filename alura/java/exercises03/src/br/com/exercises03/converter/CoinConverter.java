package br.com.exercises03.converter;

public class CoinConverter implements FinancialConversion {

    @Override
    public double convertDollarToReal(double value) {
        return value / 5.51;
    }
}
