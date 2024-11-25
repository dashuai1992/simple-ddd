package org.example.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TestProduct {
    private static ProductService productService;
    private static ProductRepository productRepository;
    private static ProductDTO productDTO;

    @BeforeAll
    static void setUp() {
        productRepository = bo -> {
            System.out.println("保存product" + bo.toString());
            return bo;
        };
        System.out.println("mock productRepository done.");

        productService = new ProductService(productRepository);
        System.out.println("mock productService done.");

        productDTO = new ProductDTO();
        productDTO.setDesc("123");
        productDTO.setId("123");
        productDTO.setName("123");
        productDTO.setPrice("123");
        System.out.println("mock productDTO done." + productDTO.toString());
    }

    @Test
    void testAddNewProduct() {
        Long id = productService.addNewProduct(productDTO);
        Assertions.assertFalse(Objects.isNull(id));
    }

    @Test
    void testDistinctObjs() {
        ArrayList<ProductDTO> productDTOS = new ArrayList<>();
        ProductDTO p1 = new ProductDTO(); p1.setId("1"); p1.setName("1"); productDTOS.add(p1);
        ProductDTO p2 = new ProductDTO(); p2.setId("2"); p2.setName("2"); productDTOS.add(p2);
        ProductDTO p3 = new ProductDTO(); p3.setId("1"); p3.setName("3"); productDTOS.add(p3);

        Collection<ProductDTO> values =
            productDTOS.stream().collect(Collectors.toMap(ProductDTO::getId, x -> x, (x, y) -> x)).values();

        List<ProductDTO> res = new ArrayList<>(values);
        res.forEach(item -> {
            System.out.println(item.getName());
        });

    }



}
