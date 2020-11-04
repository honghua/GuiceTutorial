package com.mvpjava.guicetutorial.learn.diIntroProvider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import java.util.Random;

public class BasicApplication {

    private final CheckoutService checkoutService;

    @Inject
    public BasicApplication(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }
    public void run() {
        checkoutService.checkout(100);
    }


    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountableGuiceModule() );
        BasicApplication application = guice.getInstance(BasicApplication.class);
        application.run();
    }
}
