package com.yang.guicetutorial.exampleImprove;

import static com.yang.guicetutorial.exampleImprove.Annotation.YangAnnotation;
import com.google.inject.Inject;
import com.yang.guicetutorial.common.Message;
import com.yang.guicetutorial.database.MyDatabase;

public class MessageHandler_forYang {
    private MyDatabase db;

    @Inject
    public MessageHandler_forYang(@YangAnnotation MyDatabase db) {
        this.db = db;
    }

    public Message sendMessage(long senderId, long recipientId, String text) {
        return db.insert(senderId, recipientId, text);
    }

}
