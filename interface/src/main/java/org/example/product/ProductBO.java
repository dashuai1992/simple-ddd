package org.example.product;

import lombok.Data;

@Data
public class ProductBO {
    private Long id;
    private String name;
    private String desc;
    private String price;
}
