package com.example.jaz_s27275_nbp;

import com.example.jaz_s27275_nbp.models.NbpData;
import com.example.jaz_s27275_nbp.models.NbpResponse;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {
    private final NbpRepository nbpRepository;
    private final DbRepository dbRepository;

    public ExchangeRateService(NbpRepository nbpRepository, DbRepository dbRepository) {
        this.nbpRepository = nbpRepository;
        this.dbRepository = dbRepository;
    }

    public Double getAverageExchangeRate(String currency, String startDate, String endDate) {
        NbpResponse response = this.nbpRepository.getExchangeRates(currency, startDate, endDate);
        Double avgExchangeRate = response.calculateAvgCourse();
        NbpData nbpData = new NbpData(startDate, endDate, currency, avgExchangeRate);
        this.dbRepository.save(nbpData);
        return avgExchangeRate;
    }


}
