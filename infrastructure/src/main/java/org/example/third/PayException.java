package org.example.third;

import org.example.exception.CommonException;

public class PayException extends CommonException {
    private static final String ERROR_CODE = "PAY_ERROR";

    private PayException(String msg) {
        super(ERROR_CODE, msg);
    }

    public static PayException error(String msg) {
        return new PayException(msg);
    }
}
