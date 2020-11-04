package com.yang.guicetutorial.exampleImprove;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.yang.guicetutorial.GuiceRule;
import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabase;
import com.yang.guicetutorial.database.MyDatabaseImplSql;
import org.junit.Rule;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class MessageHandler_Test {
//    Injector guice = Guice.createInjector(new AbstractModule() {
//        @Override
//        protected void configure() {
//            bind(MyDatabase.class).to(MyDatabaseImplSql.class);
//        }
//    });
//
//    MessageHandler handler = guice.getInstance(MessageHandler.class);

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
    }
}