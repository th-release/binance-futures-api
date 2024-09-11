package com.binance.utils.requests.accountInformation;

import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@Builder
@Data
public class AccountInformationRequest {
    private Optional<Long> recvWindow = Optional.empty();
}
