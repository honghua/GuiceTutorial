package com.mvpjava.guicetutorial.singleImplWithProvider;


public class NightOwlDiscount implements Discountable {

    @Override
    public double getDiscount() {
        return 0.35;
    }
    
}
