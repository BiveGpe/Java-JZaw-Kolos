package com.example.jaz_s27275_nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchange-rate")
public class ExchangeRateController {
    private final ExchangeRateService exchangeRateService;

    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping("/average")
    public ResponseEntity<Double> getAverageExchangeRate(
            @RequestParam() String currency,
            @RequestParam() String startDate,
            @RequestParam() String endDate
    ) {
        return ResponseEntity.ok(this.exchangeRateService.getAverageExchangeRate(currency, startDate, endDate));
    }
}
