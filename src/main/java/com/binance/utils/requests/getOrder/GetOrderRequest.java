package com.binance.utils.requests.getOrder;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class GetOrderRequest {
    private String symbol;
    private Optional<Long> orderId = Optional.empty();
    private Optional<String> origClientOrderId = Optional.empty();
    private Optional<Long> recvWindow = Optional.empty();
}
