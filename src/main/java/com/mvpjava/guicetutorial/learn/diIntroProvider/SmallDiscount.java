package com.mvpjava.guicetutorial.learn.diIntroProvider;

public class SmallDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.10;
    }
}
