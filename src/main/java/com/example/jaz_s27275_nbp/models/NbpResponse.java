package com.example.jaz_s27275_nbp.models;

import java.util.List;

public class NbpResponse {
    private String table;
    private String currency;
    private String code;
    private List<Rates> rates;

    public NbpResponse(String table, String currency, String code, List<Rates> rates) {
        this.table = table;
        this.currency = currency;
        this.code = code;
        this.rates = rates;
    }

    public Double calculateAvgCourse() {
        Double sum = 0.0;
        for (Rates rate : this.rates) {
            sum = sum + rate.getMid();
        }

        return sum/rates.size();
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Rates> getRates() {
        return rates;
    }

    public void setRates(List<Rates> rates) {
        this.rates = rates;
    }
}
