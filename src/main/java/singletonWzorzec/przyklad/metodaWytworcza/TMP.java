package singletonWzorzec.przyklad.metodaWytworcza;

import java.util.Arrays;
import java.util.Collections;

public class TMP implements TradeModelProcessor {

    @Override
    public TradesBookingResult bookTrade(int scenario) {

        if (scenario == 1) {
//            return new TradesBookingResult(true, Collections.emptyList());
            return TradesBookingResult.getTradeBookingResult(true);
        } else if (scenario == 2) {
//            return new TradesBookingResult(false, Collections.emptyList());
            return TradesBookingResult.getTradeBookingResult(false);
        } else if (scenario == 3) {
//            return new TradesBookingResult(true, Arrays.asList("trade1", "trade2"));
            return TradesBookingResult.getTradeBookingResult(Arrays.asList("trade1", "trade2"));
        } else {
            return new TradesBookingResult(false, Collections.emptyList());
        }
    }
}
