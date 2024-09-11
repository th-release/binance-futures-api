package com.binance.utils.requests.setMarginType;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class SetMarginTypeRequest {
    private String symbol;
    private String marginType; // ISOLATED, CROSSED
    private Optional<Long> recvWindow = Optional.empty();
}
