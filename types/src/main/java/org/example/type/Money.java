package org.example.type;

import java.math.BigDecimal;

public class Money {
    private BigDecimal money;

    public Money(String money) {
        this.money = new BigDecimal(money);
    }

    public BigDecimal getMoney() {
        return money;
    }
}
