package com.atrdjune.guice;

/**
 * Created by atrdjune on 17/7/23.
 */

import javax.inject.Provider;
import java.time.LocalDateTime;

public class DateTimeProvider implements Provider<LocalDateTime>  {
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
