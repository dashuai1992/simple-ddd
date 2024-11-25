package org.example.third;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("templatePay")
public class TemplatePay extends PayChannelStrategy implements PayService {

    public TemplatePay(@Qualifier("aliPay") PayChannel aliPay, @Qualifier("weChatPay") PayChannel weChatPay) {
        super(aliPay, weChatPay);
    }

    @Override
    public String initPay(String type, String orderId) {
        return getPayChannel(type).initPay(orderId);
    }

    @Override
    public void payDone(String type, String payDone) {
        getPayChannel(type).payDone(payDone);
    }

    @Override
    public List<Object> queryBills(String type, String Params) {
        return getPayChannel(type).queryBills(Params);
    }

}
