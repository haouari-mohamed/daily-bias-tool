package com.example.dialy.bias.tool.service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiasCalculationService {

    public String calculateBias(List<Double> prices) {
        double movingAverage = calculateMovingAverage(prices, 5);
        double latestPrice = prices.get(0);

        if (latestPrice > movingAverage) {
            return "Bullish";
        } else if (latestPrice < movingAverage) {
            return "Bearish";
        } else {
            return "Neutral";
        }
    }

    private double calculateMovingAverage(List<Double> prices, int period) {
        double sum = 0;
        for (int i = 0; i < period; i++) {
            sum += prices.get(i);
        }
        return sum / period;
    }
}

