package com.mvpjava.guicetutorial.learn.customFactory;


public class NoDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0;
    }
}
