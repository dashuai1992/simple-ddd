package org.example.pay;

import org.example.third.PayService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplatePayService {
    private final PayService templatePay;

    public TemplatePayService(PayService templatePay) {
        this.templatePay = templatePay;
    }

    public String initPayForOrder(String type, String orderId) {
        return templatePay.initPay(type, orderId);
    }

    public void callBackProcess(String type, String callBack) {
        templatePay.payDone(type, callBack);
    }

    public List<Object> queryBills(String type, String params) {
        return templatePay.queryBills(type, params);
    }

}
