package com.yang.guicetutorial.exampleImprove;

import static com.yang.guicetutorial.exampleImprove.Annotation.MengAnnotation;
import com.google.inject.Inject;
import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabase;

public class MessageHandler {
    private MyDatabase db;

    @Inject
    public MessageHandler(@MengAnnotation MyDatabase db) {
        this.db = db;
    }

    public Message sendMessage(long senderId, long recipientId, String text) {
        return db.insert(senderId, recipientId, text);
    }

}
