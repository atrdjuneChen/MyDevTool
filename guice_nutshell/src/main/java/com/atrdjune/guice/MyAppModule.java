package com.atrdjune.guice;

/**
 * Created by atrdjune on 17/7/23.
 */

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class);
        bind(LogService.class).to(LogServiceImpl.class);
        bind(Application.class).to(MyApp.class);
    }

    @Provides
    LocalDate getDate() {
        return LocalDate.of(2017, 7, 23);
    }
}
