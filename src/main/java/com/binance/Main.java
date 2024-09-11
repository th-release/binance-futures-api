package com.binance;

import com.binance.connector.futures.client.impl.UMFuturesClientImpl;
import com.binance.utils.Client;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------START");
        Client client = new Client("api", "secret");

        System.out.println(client.getBaseUrl());
        System.out.println("---------------------------END");
    }
}