package com.example.dialy.bias.tool.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AlphaVantageService {
    private static final String API_KEY = "api key";
    private static final String BASE_URL = "https://www.alphavantage.co/query";

    public String getDailyStockData(String symbol) {
        String url = BASE_URL + "?function=TIME_SERIES_DAILY&symbol=" + symbol + "&apikey=" + API_KEY;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}