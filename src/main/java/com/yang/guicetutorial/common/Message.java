package com.yang.guicetutorial.common;

import com.google.auto.value.AutoValue;

/** Tutorial for Value-typed object
 * ref: https://www.baeldung.com/introduction-to-autovalue
 *  */
@AutoValue
public abstract class Message {
    public static Message create(long Id, long senderId, long recipientId, String text) {
        return new AutoValue_Message(Id, senderId, recipientId, text);
    }

    public abstract long getId();
    public abstract long getSenderId();
    public abstract long getRecipientId();
    public abstract String getText();
}
