package com.lld.patterns.creation;

public enum SingleTonEnum {
    LOGGER;
    public void log(String message)
    {
        System.out.println(message);
    }
}
