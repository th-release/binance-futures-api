package com.binance.utils.responses.accountInformation;

import lombok.Data;

@Data
public class Position {
    private String symbol;
    private String initialMargin;
    private String maintMargin;
    private String unrealizedProfit;
    private String positionInitialMargin;
    private String openOrderInitialMargin;
    private String leverage;
    private boolean isolated;
    private String entryPrice;
    private String maxNotional;
    private String bidNotional;
    private String askNotional;
    private String positionSide;
    private String positionAmt;
    private long updateTime;
}
