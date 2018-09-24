package com.my_tower.my_tower.Model;

public class accountModel {

    private int photo ;
    private double value ;

    public accountModel(){}

    public accountModel(int photo, double value) {
        this.photo = photo;
        this.value = value;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getValue() {
        return value;
    }

    public String getValueString() {
        String valueString = String.valueOf(value);
        return valueString;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
