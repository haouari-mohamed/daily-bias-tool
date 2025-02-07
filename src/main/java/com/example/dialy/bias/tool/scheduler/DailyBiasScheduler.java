package com.example.dialy.bias.tool.scheduler;

import com.example.dialy.bias.tool.service.AlphaVantageService;
import com.example.dialy.bias.tool.service.BiasCalculationService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DailyBiasScheduler {

    private final AlphaVantageService alphaVantageService;
    private final BiasCalculationService biasCalculationService;

    public DailyBiasScheduler(AlphaVantageService alphaVantageService, BiasCalculationService biasCalculationService) {
        this.alphaVantageService = alphaVantageService;
        this.biasCalculationService = biasCalculationService;
    }

    @Scheduled(cron = "0 0 9 * * ?") // Runs at 9 AM daily
    public void calculateDailyBias() {
        String stockData = alphaVantageService.getDailyStockData("AAPL"); // Example symbol
        // Parse stockData and calculate bias
        System.out.println("Calculating daily bias...");
    }
}