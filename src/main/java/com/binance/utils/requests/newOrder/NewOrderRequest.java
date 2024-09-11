package com.binance.utils.requests.newOrder;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class NewOrderRequest {
    private String symbol;
    private String side;
    private Optional<String> positionSide = Optional.empty(); // default: BOTH, One-way: LONG or SHORT (Hedge Mode)
    private String type;
    private Optional<String> timeInForce = Optional.empty();
    private Optional<Double> quantity = Optional.empty();
    private Optional<String> reduceOnly = Optional.empty(); // true false default: false can't be sent in Hedge Mode, closePosition=true
    private Optional<Double> price = Optional.empty();
    private Optional<String> newClientOrderId = Optional.empty(); //A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: ^[\.A-Z\:/a-z0-9_-]{1,36}$
    private Optional<Double> stopPrice = Optional.empty(); // Used with STOP/STOP_MARKET or TAKE_PROFIT/TAKE_PROFIT_MARKET orders.
    private Optional<String> closePosition = Optional.empty(); // true, false Close All used with STOP_MARKET or TAKE_PROFIT_MARKET
    private Optional<Double> activationPrice = Optional.empty(); // Used with TRAILING_STOP_MARKET orders default as the latest price(supporting different workingType)
    private Optional<Double> callbackRate = Optional.empty(); // Used with TRAILING_STOP_MARKET orders, min 0.1, max 5 where 1 for 1%
    private Optional<String> workingType = Optional.empty(); // stopPrice triggered by: "MARK_PRICE", "CONTRACT_PRICE". Default "CONTRACT_PRICE"
    private Optional<String> priceProtect = Optional.empty(); // "TRUE" or "FALSE", default "FALSE". Used with STOP/STOP_MARKET or TAKE_PROFIT/TAKE_PROFIT_MARKET orders.
    private Optional<String> newOrderRespType = Optional.empty(); //"ACK", "RESULT", default "ACK"
    private Optional<String> priceMatch = Optional.empty(); // only avaliable for LIMIT/STOP/TAKE_PROFIT order; can be set to OPPONENT/ OPPONENT_5/ OPPONENT_10/ OPPONENT_20: /QUEUE/ QUEUE_5/ QUEUE_10/ QUEUE_20; Can't be passed together with price
    private Optional<String> selfTradePreventionMode = Optional.empty(); // NONE:No STP / EXPIRE_TAKER:expire taker order when STP triggers/ EXPIRE_MAKER:expire taker order when STP triggers/ EXPIRE_BOTH:expire both orders when STP triggers; default NONE
    private Optional<Long> goodTillDate = Optional.empty(); // order cancel time for timeInForce GTD, mandatory when timeInforce set to GTD; order the timestamp only retains second-level precision, ms part will be ignored; The goodTillDate timestamp must be greater than the current time plus 600 seconds and smaller than 253402300799000
    private Optional<Long> recvWindow = Optional.empty();
}
