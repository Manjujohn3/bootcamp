package com.nest.constructor;

public class Fooditems {
    int tea;
    int coffee;
    int  cake;
    int juice;

    public Fooditems(int tea, int coffee, int cake, int juice) {
        this.tea = tea;
        this.coffee = coffee;
        this.cake = cake;
        this.juice = juice;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCake() {
        return cake;
    }

    public void setCake(int cake) {
        this.cake = cake;
    }

    public int getJuice() {
        return juice;
    }

    public void setJuice(int juice) {
        this.juice = juice;
    }

}
