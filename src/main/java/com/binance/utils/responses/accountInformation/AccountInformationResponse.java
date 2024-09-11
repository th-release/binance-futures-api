package com.binance.utils.responses.accountInformation;

import lombok.Data;

import java.util.List;

@Data
public class AccountInformationResponse {
    private long feeTier;
    private boolean feeBurn;
    private boolean canDeposit;
    private boolean canWithdraw;

    private boolean multiAssetsMargin;
    private long tradeGroupId;

    private String totalInitialMargin;
    private String totalMaintMargin;
    private String totalWalletBalance;
    private String totalUnrealizedProfit;
    private String totalMarginBalance;
    private String totalPositionInitialMargin;
    private String totalOpenOrderInitialMargin;
    private String totalCrossWalletBalance;
    private String totalCrossUnPnl;
    private String availableBalance;
    private String maxWithdrawAmount;

    private List<Asset> assets;
}
