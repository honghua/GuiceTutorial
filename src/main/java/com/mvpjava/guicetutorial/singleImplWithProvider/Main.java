package com.mvpjava.guicetutorial.singleImplWithProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.grapher.graphviz.GraphvizGrapher;
import com.google.inject.internal.asm.$TypePath;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        System.out.println("I am in package: " + System.getProperty("java.class.path"));
//        System.out.println(new Main().getClass().getCanonicalName());
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//        }
        Injector injector = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = injector.getInstance(CheckoutService.class);

        service.checkout(100.00D);

    }
}
