package informations;

public class infoRep {
    private double bitcoinAmount;
    private String currencyList;
    private courBitcoin currenciesEquivalent;

    public double getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(double bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public String getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(String currencyList) {
        this.currencyList = currencyList;
    }

    public courBitcoin getCurrenciesEquivalent() {
        return currenciesEquivalent;
    }

    public void setCurrenciesEquivalent(courBitcoin currenciesEquivalent) {
        this.currenciesEquivalent = currenciesEquivalent;
    }

}
