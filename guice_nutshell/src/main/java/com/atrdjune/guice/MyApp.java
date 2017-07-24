package com.atrdjune.guice;

import javax.inject.Inject;

/**
 * Created by atrdjune on 17/7/23.
 */
public class MyApp implements Application {

    private UserService userService;
    private LogService logService;

    @Inject
    public MyApp(UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }
    @Override
    public void work() {
        userService.process();
        logService.log("Working...");
    }
}
