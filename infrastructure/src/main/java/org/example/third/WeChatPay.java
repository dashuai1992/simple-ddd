package org.example.third;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("weChatPay")
public class WeChatPay implements PayChannel{

    @Override
    public String initPay(String orderId) {
        System.out.println("初始化微信支付参数。。。");
        return "初始化微信支付参数。。。" + orderId;
    }

    @Override
    public void payDone(String payDone) {
        System.out.println("微信支付完成。。。" + payDone);
    }

    @Override
    public List<Object> queryBills(String param) {
        System.out.println("微信查询账单。。。"+param);
        return Collections.emptyList();
    }
}
