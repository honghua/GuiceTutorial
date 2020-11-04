package com.mvpjava.guicetutorial.singleImplWithProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class CheckoutService {

    private final Provider<Discountable> discountable;

    @Inject
    public CheckoutService(Provider<Discountable> discountable) {
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal) {
        double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal * discountable.get().getDiscount());
        System.out.printf("%nShopping cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n",
                shoppingCartTotal,
                discountable.get().getDiscount() * 100,
                totalAfterDiscount);

        return totalAfterDiscount;
    }
}
