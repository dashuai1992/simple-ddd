package org.example.pay;

import org.example.third.AliPay;
import org.example.third.TemplatePay;
import org.example.third.WeChatPay;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestTemplatePay {
    public static TemplatePay templatePay;

    @BeforeAll
    public static void setUp() {
        templatePay = new TemplatePay(new WeChatPay(), new AliPay());
    }

    @Test
    public void testInitPay() {
        templatePay.initPay("ALI", "O_912331245347758");
    }
}
