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

//    public static Builder builder() {
//        return new AutoValue_Message.Builder();
//    }
//    @AutoValue.Builder
//    public abstract static class Builder {
//        public abstract Builder setId(long Id);
//        public abstract Builder setSenderId(long senderId);
//        public abstract Builder setRecipientId(long recipient);
//        public abstract Builder setText(String text);
//        public abstract Message build();
//    }
}
