package org.example.third;

public class PayChannelStrategy {
    protected PayChannel aliPay;
    protected PayChannel weChatPay;

    public PayChannelStrategy(PayChannel aliPay, PayChannel weChatPay) {
        this.aliPay = aliPay;
        this.weChatPay = weChatPay;
    }

    protected PayChannel getPayChannel(String payType) {
        PayType type = PayType.fromStr(payType);
        switch (type) {
            case ALI -> {
                return this.aliPay;
            }
            case WECHAT -> {
                return this.weChatPay;
            }
            default -> {
                throw PayException.error(String.format("%s，支付渠道不可用", payType));
            }
        }
    }
}
