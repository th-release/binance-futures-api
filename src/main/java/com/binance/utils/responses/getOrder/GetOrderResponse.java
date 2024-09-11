package com.binance.utils.responses.getOrder;

import lombok.Data;

@Data
public class GetOrderResponse {
    private String avgPrice;
    private String clientOrderId;
    private String cumQuote;
    private String executedQty;
    private long orderId;
    private String origQty;
    private String origType;
    private String price;
    private boolean reduceOnly;
    private String side;
    private String positionSide;
    private String status;
    private String stopPrice;
    private boolean closePosition;
    private String symbol;
    private long time;
    private String timeInForce;
    private String type;
    private String activatePrice;
    private String priceRate;
    private long updateTime;
    private String workingType;
    private boolean priceProtect;
    private String priceMatch;
    private String selfTradePreventionMode;
    private long goodTillDate;

}
