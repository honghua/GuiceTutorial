package com.yang.guicetutorial.exampleImprove;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabase;

public class MessageHandler {
    private MyDatabase db;

    @Inject
    public MessageHandler(@Meng MyDatabase db) {
        this.db = db;
    }

    public Message sendMessage(long senderId, long recipientId, String text) {
        return db.insert(senderId, recipientId, text);
    }

}
