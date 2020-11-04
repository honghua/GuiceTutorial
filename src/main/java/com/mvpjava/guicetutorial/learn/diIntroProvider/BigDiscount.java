package com.mvpjava.guicetutorial.learn.diIntroProvider;

public class BigDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.30;
    }
}
