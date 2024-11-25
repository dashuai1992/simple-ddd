package org.example.product;

import org.example.pay.TemplatePayService;
import org.example.third.PayService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class TestTemplatePayService {
    private static TemplatePayService templatePayService;

    @BeforeAll
    static void setUp() {
        templatePayService = new TemplatePayService(new PayService() {
            @Override
            public String initPay(String type, String orderId) {
                System.out.println("initPay.." + type);
                return "initPay.." + type;
            }

            @Override
            public void payDone(String type, String payDone) {
                System.out.println("payDone.." + type);
            }

            @Override
            public List<Object> queryBills(String type, String params) {
                System.out.println("queryBills.." + type);
                return Collections.emptyList();
            }
        });
    }

    @Test
    public void testInitPay() {
        templatePayService.initPayForOrder("ALI", "O_7482947582349");
    }
}
