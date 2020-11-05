
package com.yang.guicetutorial.common;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Message extends Message {

  private final long id;
  private final long senderId;
  private final long recipientId;
  private final String text;

  AutoValue_Message(
      long id,
      long senderId,
      long recipientId,
      String text) {
    this.id = id;
    this.senderId = senderId;
    this.recipientId = recipientId;
    if (text == null) {
      throw new NullPointerException("Null text");
    }
    this.text = text;
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public long getSenderId() {
    return senderId;
  }

  @Override
  public long getRecipientId() {
    return recipientId;
  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public String toString() {
    return "Message{"
        + "id=" + id + ", "
        + "senderId=" + senderId + ", "
        + "recipientId=" + recipientId + ", "
        + "text=" + text
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Message) {
      Message that = (Message) o;
      return (this.id == that.getId())
           && (this.senderId == that.getSenderId())
           && (this.recipientId == that.getRecipientId())
           && (this.text.equals(that.getText()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (this.id >>> 32) ^ this.id;
    h *= 1000003;
    h ^= (this.senderId >>> 32) ^ this.senderId;
    h *= 1000003;
    h ^= (this.recipientId >>> 32) ^ this.recipientId;
    h *= 1000003;
    h ^= this.text.hashCode();
    return h;
  }

}
