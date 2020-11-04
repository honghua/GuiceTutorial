package com.mvpjava.guicetutorial.learn.customFactory;

import com.google.inject.Inject;

public class CheckoutService {

    private final DiscountFactory discountFactory;

    @Inject
    public CheckoutService(DiscountFactory discountFactory) {
        this.discountFactory = discountFactory;
    }

    public double checkout(ShoppingCart cart) {
        Discountable discountable = discountFactory.getDiscount(cart);
        double total = cart.getCartTotal();
        double discount = discountable.getDiscount();
        double totalAfterDiscount = total - total * discount;

        System.out.printf("discount: %f \n total: %f \n", discount, total);
        return totalAfterDiscount;
    }
}
