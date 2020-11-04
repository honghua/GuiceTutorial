package com.mvpjava.guicetutorial.singleImplWithProvider;
import com.google.inject.ImplementedBy;
import com.google.inject.ProvidedBy;

//@ImplementedBy(EarlyBirdDiscount.class)
@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    double getDiscount();
}
