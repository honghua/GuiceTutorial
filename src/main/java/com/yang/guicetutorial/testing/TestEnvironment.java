package com.yang.guicetutorial.testing;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import com.yang.guicetutorial.common.Message;

import java.util.Set;

@AutoValue
public abstract class TestEnvironment {

    public static Builder builder() {
        return new AutoValue_TestEnvironment.Builder();
    }

    public abstract ImmutableSet<Message> getMessageSet();


    @AutoValue.Builder
    public abstract static class Builder {
        abstract ImmutableSet.Builder<Message> messageSetBuilder();

        public Builder addMessage(Message message) {
            messageSetBuilder().add(message);
            return this;
        }

        public abstract TestEnvironment build();
    }
}
