package org.example;


import java.util.UUID;

public class Mark {
    public static final String APP_MARK ;
    static {
        APP_MARK = UUID.randomUUID().toString();
    }
}
