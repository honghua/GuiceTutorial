package com.yang.guicetutorial.database;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.lang.annotation.Annotation;

public class MyDatabaseTestRule implements TestRule {
    @Override
    public Statement apply(Statement base, Description description) {
        return null;
    }

    public Module asModule(Class<? extends Annotation> annotationType) {
        return new AbstractModule() {
            @Override
            protected void configure() {

            }
        };
    }

    private final class TestDatabaseModule extends AbstractModule {

        @Override
        protected void configure() {

        }
    }
}
