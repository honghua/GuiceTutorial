package com.mvpjava.guicetutorial.singleImplWithProvider;

import com.google.inject.Provider;

public class DiscountProvider implements Provider<Discountable> {

    @Override
    public Discountable get() {
        return new NightOwlDiscount();
    }
}
