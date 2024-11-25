package org.example.product;

import org.example.type.LongId;
import org.example.type.Money;
import org.example.type.StringText;

import java.math.BigDecimal;

public class ProductDO {

    private LongId id;
    private StringText name;
    private StringText desc;
    private Money price;

    public Long getId() {
        return id.getId();
    }

    public String getName() {
        return name.getText();
    }

    public String getDesc() {
        return desc.getText();
    }

    public BigDecimal getPrice() {
        return price.getMoney();
    }

    private ProductDO() { }

    public static Builder newBuilder() {
        Builder builder = new Builder(new ProductDO());
        return builder.id(0L);
    }

    public static class Builder {
        private ProductDO product;

        public Builder(ProductDO product) {
            this.product = product;
        }

        public Builder id(Long id) {
            this.product.id = new LongId(id);
            return this;
        }

        public Builder name(String name) {
            this.product.name = new StringText(name,32);
            return this;
        }

        public Builder desc(String desc) {
            this.product.desc = new StringText(desc, 255);
            return this;
        }

        public Builder price(String price) {
            this.product.price = new Money(price);
            return this;
        }

        public ProductDO build() {
            return this.product;
        }
    }

}
