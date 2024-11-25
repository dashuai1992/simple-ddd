package org.example.third;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("aliPay")
public class AliPay implements PayChannel{
    @Override
    public String initPay(String orderId) {
        System.out.println("初始化支付宝支付参数。。。");
        return "初始化支付宝支付参数。。。" + orderId;
    }

    @Override
    public void payDone(String payDone) {
        System.out.println("支付宝支付完成。。。" + payDone);
    }

    @Override
    public List<Object> queryBills(String param) {
        System.out.println("支付宝查询账单。。。");
        return Collections.emptyList();
    }
}
