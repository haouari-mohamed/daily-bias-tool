package com.example.dialy.bias.tool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bias")
public class BiasController {

    @GetMapping("/daily")
    public String getDailyBias() {
        return "Bullish"; // Example output
    }
}