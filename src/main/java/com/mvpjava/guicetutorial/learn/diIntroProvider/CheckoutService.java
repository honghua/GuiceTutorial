package com.mvpjava.guicetutorial.learn.diIntroProvider;

import com.google.inject.Inject;

public class CheckoutService {

    private final Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable) {
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal) {
        double discount = discountable.getDiscount();

        System.out.printf("discount %f", discount);
        return discount;
    }
}
