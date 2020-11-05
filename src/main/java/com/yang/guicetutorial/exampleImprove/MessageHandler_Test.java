package com.yang.guicetutorial.exampleImprove;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.yang.guicetutorial.external.GuiceRule;
import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabase;
import com.yang.guicetutorial.database.MyDatabaseImplSql;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.truth.Truth.assertThat;

public class MessageHandler_Test {


    /** Method_Naive.   explicit passing through constructor  */
   /* private MessageHandler handler;
    @Before
    public void setup() throws Exception {
        handler = new MessageHandler(new MyDatabaseImplSql());
    }*/


    /** Method1. explicit call Guice injector */
/*    Injector guice = Guice.createInjector(new AbstractModule() {
        @Override
        protected void configure() {
            bind(MyDatabase.class).annotatedWith(Annotation.MengAnnotation.class).to(MyDatabaseImplSql.class);
        }
    });

    private MessageHandler handler = guice.getInstance(MessageHandler.class);*/




    /** Method2. Inject + GuiceRule with @Rule annotation */
    @Inject private MessageHandler handler;

    @Rule
    public GuiceRule guiceRule = new GuiceRule(new AbstractModule() {
        @Override
        protected void configure() {
            bind(MyDatabase.class).annotatedWith(Annotation.MengAnnotation.class).toInstance(new MyDatabaseImplSql());
        }
    });



    @Test
    public void sendMessage() {
        long senderId = 1;
        long recipientId = 2;
        String messageText = "Hello";

        Message messageSent = handler.sendMessage(senderId, recipientId, messageText);
        Message expectedMessage = Message.create(messageSent.getId(), senderId, recipientId, messageText);
        assertThat(messageSent).isEqualTo(expectedMessage);


        ArrayList<Integer> pair1 = new ArrayList<>();
        pair1.add(1);
        pair1.add(2);

        ArrayList<Integer> pair2 = new ArrayList<>();
        pair2.add(1);
        pair2.add(2);



        System.out.println((pair1.hashCode() == pair2.hashCode()) + "; and \n\n" + pair1.equals(pair2));

    }
}