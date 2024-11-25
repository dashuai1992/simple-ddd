package org.example.product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Long addNewProduct(ProductDTO dto) {
        // DTO build to DO
        ProductDO productDO = ProductDataTransfer.DTOtoDO(dto);

        // business process, and get a bo
        ProductBO productBO = ProductDataTransfer.DOtoBO(productDO);

        // save bo through the `saveProduct` method that inner save bo as a dao
        ProductBO saved = this.productRepository.saveProduct(productBO);
        return saved.getId();
    }
}
