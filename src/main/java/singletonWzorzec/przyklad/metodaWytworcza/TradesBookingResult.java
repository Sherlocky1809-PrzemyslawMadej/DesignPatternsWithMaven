package singletonWzorzec.przyklad.metodaWytworcza;

import java.util.Collections;
import java.util.List;

public class TradesBookingResult {

    private final static TradesBookingResult successfulScenario = new TradesBookingResult(true, Collections.emptyList());
    private final static TradesBookingResult notSuccessfulScenario = new TradesBookingResult(true, Collections.emptyList());

    private boolean isBookingSuccessful;
    private List<String> trades;

    public TradesBookingResult(boolean isBookingSuccessful, List<String> trades) {
        this.isBookingSuccessful = isBookingSuccessful;
        this.trades = trades;
    }

    public static TradesBookingResult getTradeBookingResult(boolean result) {
        return result ? successfulScenario : notSuccessfulScenario;
    }

    public static TradesBookingResult getTradeBookingResult (List<String> trades) {
        return new TradesBookingResult(true, trades);
    }

    public boolean isBookingSuccessful() {
        return isBookingSuccessful;
    }

    public List<String> getTrades() {
        return trades;
    }
}
