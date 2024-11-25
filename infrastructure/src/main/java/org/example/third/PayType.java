package org.example.third;

public enum PayType {
    WECHAT("微信"),
    ALI("支付宝"),
    UNION("银联");

    private String name;

    PayType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static PayType fromStr(String type) {
        try {
            return PayType.valueOf(type);
        } catch (Exception e) {
            throw PayException.error(String.format("不支持的支付方式[%s]", type));
        }
    }
}
