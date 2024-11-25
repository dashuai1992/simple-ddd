package org.example.product;

import org.springframework.stereotype.Service;

@Service
public class ProductRepositoryImpl implements ProductRepository{
    @Override
    public ProductBO saveProduct(ProductBO bo) {
        System.out.println("保存product" + bo.toString());
        return bo;
    }
}
