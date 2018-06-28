package com.example.user.currencyconverter;

/**
 * Created by User on 10/4/2017.
 */
public class Curr {
    private double pound;
    private double dollar;

    public void set_pound(double pound) {
        this.pound = pound;
    }
    public void set_dollar(double dollar) {
        this.dollar = dollar;
    }

    public double get_pound() {
        return pound;
    }
    public double get_dollar() {
        return dollar;
    }

    public double confromDtoP(){
        return dollar*17.6;
    }
    public double confromPtoD(){
        return pound*0.05;
    }
}
