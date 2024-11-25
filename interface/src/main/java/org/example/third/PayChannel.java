package org.example.third;

import java.util.List;

public interface PayChannel {
    String initPay(String orderId);

    void payDone(String payDone);

    List<Object> queryBills(String param);
}
