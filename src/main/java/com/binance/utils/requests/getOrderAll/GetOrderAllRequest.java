package com.binance.utils.requests.getOrderAll;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class GetOrderAllRequest {
    private String symbol;
    private Optional<Long> orderId = Optional.empty();
    private Optional<Long> startTime = Optional.empty();
    private Optional<Long> endTime = Optional.empty();
    private Optional<Long> limit = Optional.empty();
    private Optional<Long> recvWindow = Optional.empty();
}
