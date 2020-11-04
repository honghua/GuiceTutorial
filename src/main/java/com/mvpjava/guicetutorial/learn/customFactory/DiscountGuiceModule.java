package com.mvpjava.guicetutorial.learn.customFactory;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

import static com.mvpjava.guicetutorial.learn.customFactory.DiscountGuiceModule.DiscountOption.*;

public class DiscountGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<DiscountOption, Discountable> mapBinder = MapBinder.newMapBinder(
                binder(),
                DiscountOption.class, Discountable.class
        );

        mapBinder.addBinding(BIGDISCOUNT).to(BigDiscount.class);
        mapBinder.addBinding(SMALLDISCOUNT).to(SmallDiscount.class);
        mapBinder.addBinding(NODISCOUNT).to(NoDiscount.class);
    }

    public enum  DiscountOption {
        BIGDISCOUNT, SMALLDISCOUNT, NODISCOUNT
    }
}
