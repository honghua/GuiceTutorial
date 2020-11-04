package com.mvpjava.guicetutorial.learn.customFactory;

public class SmallDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.10;
    }
}
