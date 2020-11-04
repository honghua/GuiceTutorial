package com.yang.guicetutorial.exampleImprove;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.yang.guicetutorial.database.MyDatabaseImplSql;

public class Main {
    static Injector injector = Guice.createInjector(new BasicModule());
    public static void main(String[] args) {

//        Naive instance injection
//        MessageHandler handler = new MessageHandler(new MyDatabaseImplSql());


        // Dependency injection with Guice: better
        MessageHandler handler = injector.getInstance(MessageHandler.class);
        System.out.println(
            handler.sendMessage(1, 2, "hello")
        );
    }

    public void foo() {
        MessageHandler handler = injector.getInstance(MessageHandler.class);
    }
}
