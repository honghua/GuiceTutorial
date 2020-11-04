package com.mvpjava.guicetutorial.singleImplWithProvider;

import com.google.inject.Provides;

public class DiscountGuiceModule  extends com.google.inject.AbstractModule{
    @Override
    protected void configure() {
       /*bind(Discountable.class).toProvider(DiscountProvider.class);*/
    }


//    @Provides
//    public Discountable get() {
//        return new NightOwlDiscount();
//    }
}
