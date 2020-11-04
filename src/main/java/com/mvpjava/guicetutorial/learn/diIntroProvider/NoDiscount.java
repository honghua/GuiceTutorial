package com.mvpjava.guicetutorial.learn.diIntroProvider;

public class NoDiscount implements Discountable {
    @Override
    public double getDiscount() {
        return 0;
    }
}
