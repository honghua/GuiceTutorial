package com.mvpjava.guicetutorial.learn.diIntroProvider;

import com.google.inject.ProvidedBy;

@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    double getDiscount();
}
