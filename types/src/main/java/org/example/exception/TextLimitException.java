package org.example.exception;

public class TextLimitException extends CommonException{
    private static String ERROR_CODE = "TEXT_LIMIT";
    public TextLimitException(String msg) {
        super(ERROR_CODE, msg);
    }
}
