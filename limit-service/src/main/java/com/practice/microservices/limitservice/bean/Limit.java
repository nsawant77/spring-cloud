package com.practice.microservices.limitservice.bean;

public class Limit {

    private int minimum;
    private int maximum;

    public Limit(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

}
