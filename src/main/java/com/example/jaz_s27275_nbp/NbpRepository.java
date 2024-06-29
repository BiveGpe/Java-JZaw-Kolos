package com.example.jaz_s27275_nbp;

import com.example.jaz_s27275_nbp.models.NbpResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class NbpRepository {
    private final String url = "http://api.nbp.pl/api/exchangerates/rates/";
    private final RestTemplate restTemplate = new RestTemplate();

    public NbpResponse getExchangeRates(String currency, String startDate, String endDate) {
        String url = this.url + "a/" + currency + "/" + startDate + "/" + endDate + "/";
        return this.restTemplate.getForObject(url, NbpResponse.class);
    }
}
