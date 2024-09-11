package com.binance.utils.requests.setLeverage;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class SetLeverageRequest {
    private String symbol;
    private long leverage;
    private Optional<Long> recvWindow = Optional.empty();
}
