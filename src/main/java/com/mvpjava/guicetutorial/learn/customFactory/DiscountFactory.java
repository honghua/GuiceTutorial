package com.mvpjava.guicetutorial.learn.customFactory;

import com.google.inject.ImplementedBy;
import com.google.inject.ProvidedBy;

@ImplementedBy(CartDiscountFactory.class)
public interface DiscountFactory {
    Discountable getDiscount(ShoppingCart cart);
}
