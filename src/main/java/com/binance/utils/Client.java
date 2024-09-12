package com.binance.utils;

import com.binance.connector.futures.client.exceptions.BinanceClientException;
import com.binance.connector.futures.client.exceptions.BinanceConnectorException;
import com.binance.connector.futures.client.exceptions.BinanceServerException;
import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import com.binance.utils.requests.accountInformation.AccountInformationRequest;
import com.binance.utils.requests.getOrder.GetOrderRequest;
import com.binance.utils.requests.getOrderAll.GetOrderAllRequest;
import com.binance.utils.requests.newOrder.NewOrderRequest;
import com.binance.utils.requests.setLeverage.SetLeverageRequest;
import com.binance.utils.requests.setMarginType.SetMarginTypeRequest;
import com.binance.utils.requests.setPositionMode.SetPositionModeRequest;
import com.binance.utils.responses.getOrder.GetOrderResponse;
import com.binance.utils.responses.getOrderAll.GetOrderAllResponse;
import com.binance.utils.responses.newOrder.NewOrderResponse;
import com.binance.utils.responses.setMarginType.SetMarginTypeResponse;
import com.binance.utils.responses.accountInformation.AccountInformationResponse;
import com.binance.utils.responses.setLeverage.SetLeverageResponse;
import com.binance.utils.responses.setPositionMode.SetPositionModeResponse;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Client {
    private Gson gson = new Gson();
    private UMFuturesClientImpl client;

    public Client(String apiKey, String secretKey) {
        client = new UMFuturesClientImpl(apiKey, secretKey);
    }

    public String getBaseUrl() {
        return client.getBaseUrl();
    }

    public String getApiKey() {
        return client.getApiKey();
    }

    public String getSecretKey() {
        return client.getSecretKey();
    }

    public String getProductUrl() {
        return client.getProductUrl();
    }

    public Failable<SetPositionModeResponse, String> setPositionMode(SetPositionModeRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());

        parameters.put("dualSidePosition", request.getDualSidePosition());

        try {
            return Failable.success(gson.fromJson(client.account().changePositionModeTrade(parameters), SetPositionModeResponse.class));
        } catch (BinanceServerException | BinanceConnectorException | BinanceClientException e) {
            return Failable.error(e.getMessage());
        }
    }

    public Failable<SetMarginTypeResponse, String> setMarginType(SetMarginTypeRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());

        parameters.put("symbol", request.getSymbol());
        parameters.put("marginType", request.getMarginType());
        parameters.put("timestamp", System.currentTimeMillis());

        try {
            return Failable.success(gson.fromJson(client.account().changeMarginType(parameters), SetMarginTypeResponse.class));
        } catch (BinanceServerException | BinanceConnectorException | BinanceClientException e) {
            return Failable.error(e.getMessage());
        }
    }

    public Failable<SetLeverageResponse, String> setLeverage(SetLeverageRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());

        parameters.put("symbol", request.getSymbol());
        parameters.put("leverage", request.getLeverage());
        parameters.put("timestamp", System.currentTimeMillis());

        try {
            return Failable.success(gson.fromJson(client.account().changeInitialLeverage(parameters), SetLeverageResponse.class));
        } catch (BinanceServerException | BinanceConnectorException | BinanceClientException e) {
            return Failable.error(e.getMessage());
        }
    }

    public Failable<AccountInformationResponse, String> accountInformation(AccountInformationRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());

        parameters.put("timestamp", System.currentTimeMillis());

        try {
            return Failable.success(gson.fromJson(client.account().accountInformation(parameters), AccountInformationResponse.class));
        } catch (BinanceConnectorException | BinanceClientException | BinanceServerException e) {
            return Failable.error(e.getMessage());
        }
    }

    public Failable<NewOrderResponse, String> newOrder(NewOrderRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());

        if (request.getPositionSide().isPresent())
            parameters.put("positionSide", request.getPositionSide().get());

        if (request.getTimeInForce().isPresent())
            parameters.put("timeInForce", request.getTimeInForce().get());

        if (request.getQuantity().isPresent())
            parameters.put("quantity", request.getQuantity().get());

        if (request.getReduceOnly().isPresent())
            parameters.put("reduceOnly", request.getReduceOnly());

        if (request.getPrice().isPresent())
            parameters.put("price", request.getPrice());

        if (request.getNewClientOrderId().isPresent())
            parameters.put("newClientOrderId", request.getNewClientOrderId().get());

        if (request.getStopPrice().isPresent())
            parameters.put("stopPrice", request.getStopPrice().get());

        if (request.getClosePosition().isPresent())
            parameters.put("closePosition", request.getClosePosition().get());

        if (request.getActivationPrice().isPresent())
            parameters.put("activationPrice", request.getActivationPrice().get());

        if (request.getCallbackRate().isPresent())
            parameters.put("callbackRate", request.getCallbackRate().get());

        if (request.getWorkingType().isPresent())
            parameters.put("workingType", request.getWorkingType().get());

        if (request.getPriceProtect().isPresent())
            parameters.put("priceProtect", request.getPriceProtect().get());

        if (request.getNewOrderRespType().isPresent())
            parameters.put("newOrderRespType", request.getNewOrderRespType().get());

        if (request.getPriceMatch().isPresent())
            parameters.put("priceMatch", request.getPriceMatch().get());

        if (request.getSelfTradePreventionMode().isPresent())
            parameters.put("selfTradePreventionMode", request.getSelfTradePreventionMode().get());

        if (request.getGoodTillDate().isPresent())
            parameters.put("goodTillDate", request.getGoodTillDate());

        parameters.put("symbol", request.getSymbol());
        parameters.put("side", request.getSide());
        parameters.put("type", request.getType());

        parameters.put("timestamp", System.currentTimeMillis());

        try {
            return Failable.success(gson.fromJson(client.account().newOrder(parameters), NewOrderResponse.class));
        } catch (BinanceConnectorException | BinanceClientException | BinanceServerException e) {
            return Failable.error(e.getMessage());
        }
    }

    public Failable<GetOrderResponse, String> getOrder(GetOrderRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());


        if (request.getOrderId().isPresent())
            parameters.put("orderId", request.getOrderId().get());

        if (request.getOrigClientOrderId().isPresent())
            parameters.put("origClientOrderId", request.getOrigClientOrderId());

        parameters.put("timestamp", System.currentTimeMillis());

        try {
            return Failable.success(gson.fromJson(client.account().queryOrder(parameters), GetOrderResponse.class));
        } catch (BinanceConnectorException | BinanceClientException | BinanceServerException e) {
            return Failable.error(e.getMessage());
        }
    }

    public Failable<List<GetOrderAllResponse>, String> getOrderAll(GetOrderAllRequest request) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<String,Object>();

        if (request.getRecvWindow().isPresent())
            parameters.put("recvWindow", request.getRecvWindow().get());

        if (request.getOrderId().isPresent())
            parameters.put("orderId", request.getOrderId().get());

        if (request.getStartTime().isPresent())
            parameters.put("startTime", request.getStartTime().get());

        if (request.getEndTime().isPresent())
            parameters.put("endTime", request.getEndTime().get());

        if (request.getLimit().isPresent())
            parameters.put("limit", request.getLimit().get());

        parameters.put("symbol", request.getSymbol());
        parameters.put("timestamp", System.currentTimeMillis());

        try {
            GetOrderAllResponse[] response = gson.fromJson(client.account().allOrders(parameters), GetOrderAllResponse[].class);

            return Failable.success(Arrays.stream(response).toList());
        } catch (BinanceConnectorException | BinanceClientException | BinanceServerException e) {
            return Failable.error(e.getMessage());
        }
    }
}
