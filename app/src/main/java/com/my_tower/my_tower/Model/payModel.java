package com.my_tower.my_tower.Model;

import java.util.Date;

public class payModel {
    private String date;
    private Double value ;
    private String currency ;

    public payModel(String date, Double value, String currency) {
        this.date = date;
        this.value = value;
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public String getDateString() {
        String dateString = String.valueOf(date);
        return dateString;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public String getValueSTring() {
        String valueString = String.valueOf(value);
        return valueString;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
