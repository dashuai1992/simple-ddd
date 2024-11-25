package org.example.third;

import java.util.List;

public interface PayService {
    String initPay(String type, String orderId);

    void payDone(String type, String payDone);

    List<Object> queryBills(String type, String Params);
}
