package com.yang.guicetutorial.exampleImprove;

import static com.yang.guicetutorial.exampleImprove.Annotation.*;

import com.google.inject.AbstractModule;
import com.google.inject.internal.cglib.proxy.$FixedValue;
import com.yang.guicetutorial.database.MyDatabase;
import com.yang.guicetutorial.database.MyDatabaseImplMongoDb;
import com.yang.guicetutorial.database.MyDatabaseImplSql;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyDatabase.class).annotatedWith(YangAnnotation.class).to(MyDatabaseImplSql.class);
        bind(MyDatabase.class).annotatedWith(MengAnnotation.class).to(MyDatabaseImplMongoDb.class);
    }
}
