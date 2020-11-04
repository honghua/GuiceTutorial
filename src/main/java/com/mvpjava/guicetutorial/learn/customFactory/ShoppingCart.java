package com.mvpjava.guicetutorial.learn.customFactory;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ShoppingCart {

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    public LocalTime getTimeOfCheckout() {
        return timeOfCheckout;
    }

    public void setTimeOfCheckout(LocalTime timeOfCheckout) {
        this.timeOfCheckout = timeOfCheckout;
    }

    private LocalTime timeOfCheckout;
    private double cartTotal;

}
