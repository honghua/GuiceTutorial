package com.yang.guicetutorial.exampleNaive;

import com.yang.guicetutorial.database.MyDatabase;
import com.yang.guicetutorial.common.Message;

public class MessageHandler {
    private MyDatabase db;
    public MessageHandler(MyDatabase db) {
        this.db = db;
    }

    public Message sendMessage(long senderId, long recipientId, String text) {
        return db.insert(senderId, recipientId, text);
    }
}
