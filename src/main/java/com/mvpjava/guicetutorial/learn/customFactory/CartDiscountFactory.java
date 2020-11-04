package com.mvpjava.guicetutorial.learn.customFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;

import static com.mvpjava.guicetutorial.learn.customFactory.DiscountGuiceModule.DiscountOption.*;

@Singleton
public class CartDiscountFactory implements DiscountFactory {

    final Map<DiscountGuiceModule.DiscountOption, Discountable> discountableBinder;

    @Inject
    public CartDiscountFactory(Map<DiscountGuiceModule.DiscountOption, Discountable> mapBinder) {
        this.discountableBinder = mapBinder;
    }

    @Override
    public Discountable getDiscount(ShoppingCart cart) {
        int currentHour = cart.getTimeOfCheckout().getHour();

        switch (currentHour) {
            case 1:
                return discountableBinder.get(SMALLDISCOUNT);
            case 2:
                return discountableBinder.get(BIGDISCOUNT);
            default:
                return discountableBinder.get(NODISCOUNT);
        }
    }
}
