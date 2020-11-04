package com.mvpjava.guicetutorial.learn.customFactory;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.sun.istack.internal.NotNull;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class BasicApplication {

    private final CheckoutService checkoutService;
    @Inject
    public BasicApplication(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }
    public void run() {
        while (true) {
            checkoutService.checkout(getNewCart());
        }
    }

    public static void main(String[] args) {
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        BasicApplication application = guice.getInstance(BasicApplication.class);
        application.run();
    }

    private ShoppingCart getNewCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.setTimeOfCheckout(getTimeFromInput());
        cart.setCartTotal(getCartTotalFromInput());
        return cart;
    }

    private LocalTime getTimeFromInput() {
        LocalTime checkoutTime;
        String hour = null;
        System.out.print("Enter Checkout hour: ");

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            hour = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return LocalTime.of(Integer.parseInt(hour), 0);
    }

    private double getCartTotalFromInput() {
        String total = null;
        System.out.print("Enter total: ");

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            total = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Double.parseDouble(total);
    }

}
