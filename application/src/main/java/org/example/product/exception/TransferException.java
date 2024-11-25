package org.example.product.exception;

import org.example.exception.CommonException;

public class TransferException extends CommonException {

    private static final String ERROR_CODE = "PRODUCT_DATA_TRANSFER_ERROR";

    public TransferException(String msg) {
        super(ERROR_CODE, msg);
    }
}
