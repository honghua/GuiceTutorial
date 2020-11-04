package com.mvpjava.guicetutorial.learn.customFactory;


public class BigDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.30;
    }
}
