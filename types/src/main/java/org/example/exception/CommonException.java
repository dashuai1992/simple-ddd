package org.example.exception;

public class CommonException extends RuntimeException{
    private String code;

    public CommonException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
