package com.mvpjava.guicetutorial.simpleExternal;
import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)  
public interface Discountable {
    double getDiscount ();
}
