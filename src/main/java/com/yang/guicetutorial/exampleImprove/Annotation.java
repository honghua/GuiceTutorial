package com.yang.guicetutorial.exampleImprove;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Annotation {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MengAnnotation {
    }

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface YangAnnotation {

    }
}
