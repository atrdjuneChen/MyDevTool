package com.atrdjune.guice;

/**
 * Created by atrdjune on 17/7/23.
 */

public class LogServiceImpl implements LogService {
    @Override
    public void log(String msg) {
        System.out.println("------LOG:" + msg);
    }
}
