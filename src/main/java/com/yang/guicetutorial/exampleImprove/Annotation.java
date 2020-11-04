package com.yang.guicetutorial.exampleImprove;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;

public class Annotation {

    @Qualifier
    @Retention(RuntimePolicy)
    @interface DbAnnotation
}
