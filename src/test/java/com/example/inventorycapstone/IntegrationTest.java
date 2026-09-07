package com.example.inventorycapstone;

import com.example.inventorycapstone.config.AsyncSyncConfiguration;
import com.example.inventorycapstone.config.DatabaseTestcontainer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        InventoryCapstoneApp.class,
        AsyncSyncConfiguration.class,
        com.example.inventorycapstone.config.JacksonHibernateConfiguration.class,
        DatabaseTestcontainer.class,
    }
)
public @interface IntegrationTest {}
