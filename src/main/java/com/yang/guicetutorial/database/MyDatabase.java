package com.yang.guicetutorial.database;

import com.google.inject.ImplementedBy;
import com.yang.guicetutorial.common.Message;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//@ImplementedBy(MyDatabaseImplSql.class)
public abstract class MyDatabase {
    //    public abstract Message insert(long senderId, long recipientId, String text);
    private static final Random rnd = new Random();
    private Set<Message> messages = new HashSet<>();

    public Message insert(long senderId, long recipientId, String text) {
        Message ms = Message.create(rnd.nextLong(), senderId, recipientId, text);
        messages.add(ms);
        return ms;
    }
}
