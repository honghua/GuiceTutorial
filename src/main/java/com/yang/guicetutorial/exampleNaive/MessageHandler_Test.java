package com.yang.guicetutorial.exampleNaive;

import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabaseImplSql;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class MessageHandler_Test {

    private MessageHandler handler;

    @Before
    public void setUp() throws Exception {
        handler = new MessageHandler(new MyDatabaseImplSql());
    }

    @After
    public void tearDown() throws Exception {
        handler = null;
    }

    @Test
    public void testSendMessage() {
        long senderId = 1;
        long recipientId = 2;
        String messageText = "Hello";

        Message messageSent = handler.sendMessage(senderId, recipientId, messageText);
        Message expectedMessage = Message.create(messageSent.getId(), senderId, recipientId, messageText);
        assertThat(messageSent).isEqualTo(expectedMessage);
    }
}