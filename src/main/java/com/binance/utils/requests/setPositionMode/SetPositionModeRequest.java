package com.binance.utils.requests.setPositionMode;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class SetPositionModeRequest {
    private String dualSidePosition; // true false
    private Optional<Long> recvWindow = Optional.empty();
}
