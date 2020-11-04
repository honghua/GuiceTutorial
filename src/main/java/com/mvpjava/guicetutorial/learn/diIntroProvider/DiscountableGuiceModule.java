package com.mvpjava.guicetutorial.learn.diIntroProvider;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Provides;
import com.google.inject.multibindings.MapBinder;
import com.mvpjava.guicetutorial.provider.diIntoProvider.DiscountableProvider;

import java.util.Random;

public class DiscountableGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        MapBinder<Integer, Discountable> mapBinder = MapBinder.newMapBinder(
                binder(),
                Integer.class, Discountable.class);

        mapBinder.addBinding(0).to(BigDiscount.class);
        mapBinder.addBinding(1).to(SmallDiscount.class);
        mapBinder.addBinding(2).to(NoDiscount.class);

        bind(Random.class).toInstance(new Random());
        bind(Discountable.class).toProvider(DiscountProvider.class);

    }

//    @Provides

}
