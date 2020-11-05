
package com.yang.guicetutorial.testing;

import com.google.common.collect.ImmutableSet;
import com.yang.guicetutorial.common.Message;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_TestEnvironment extends TestEnvironment {

  private final ImmutableSet<Message> messageSet;

  private AutoValue_TestEnvironment(
      ImmutableSet<Message> messageSet) {
    this.messageSet = messageSet;
  }

  @Override
  public ImmutableSet<Message> getMessageSet() {
    return messageSet;
  }

  @Override
  public String toString() {
    return "TestEnvironment{"
        + "messageSet=" + messageSet
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TestEnvironment) {
      TestEnvironment that = (TestEnvironment) o;
      return (this.messageSet.equals(that.getMessageSet()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.messageSet.hashCode();
    return h;
  }

  static final class Builder extends TestEnvironment.Builder {
    private ImmutableSet.Builder<Message> messageSetBuilder$;
    private ImmutableSet<Message> messageSet;
    Builder() {
      this.messageSet = ImmutableSet.of();
    }
    Builder(TestEnvironment source) {
      this.messageSet = source.getMessageSet();
    }
    @Override
    public ImmutableSet.Builder<Message> messageSetBuilder() {
      if (messageSetBuilder$ == null) {
        messageSetBuilder$ = ImmutableSet.builder();
        messageSetBuilder$.addAll(messageSet);
        messageSet = null;
      }
      return messageSetBuilder$;
    }
    @Override
    public TestEnvironment build() {
      if (messageSetBuilder$ != null) {
        messageSet = messageSetBuilder$.build();
      }
      return new AutoValue_TestEnvironment(
          this.messageSet);
    }
  }

}
