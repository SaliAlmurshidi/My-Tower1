package com.my_tower.my_tower.Model;

public class serviceModel {
    private String service;
    private String cyclic;
    private Double value ;
    private String currency ;

    public serviceModel(){}

    public serviceModel(String service, String cyclic, Double value, String currency) {
        this.service = service;
        this.cyclic = cyclic;
        this.value = value;
        this.currency = currency;
    }

    public serviceModel(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCyclic() {
        return cyclic;
    }

    public void setCyclic(String cyclic) {
        this.cyclic = cyclic;
    }

    public Double getValue() {
        return value;
    }

    public String getValueSTring() {
        String tot = new Double(value).toString();
        return tot;
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
