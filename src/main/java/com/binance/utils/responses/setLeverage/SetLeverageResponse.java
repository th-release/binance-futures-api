package com.binance.utils.responses.setLeverage;

import lombok.Data;

@Data
public class SetLeverageResponse {
    private long leverage;
    private String maxNotionalValue;
    private String symbol;
}
