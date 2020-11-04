package com.yang.guicetutorial.exampleImprove;

import com.google.inject.Inject;
import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabase;

public class FooHandler {
    private MyDatabase db;

    @Inject
    public FooHandler(@Yang MyDatabase db) {
        this.db = db;
    }

    public Message sendMessage(long senderId, long recipientId, String text) {
        return db.insert(senderId, recipientId, text);
    }

}
