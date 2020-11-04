package com.yang.guicetutorial.exampleImprove;

import com.google.inject.AbstractModule;
import com.google.inject.internal.cglib.proxy.$FixedValue;
import com.yang.guicetutorial.database.MyDatabase;
import com.yang.guicetutorial.database.MyDatabaseImplMongoDb;
import com.yang.guicetutorial.database.MyDatabaseImplSql;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyDatabase.class).annotatedWith(Yang.class).to(MyDatabaseImplSql.class);
        bind(MyDatabase.class).annotatedWith(Meng.class).to(MyDatabaseImplMongoDb.class);
    }

}
