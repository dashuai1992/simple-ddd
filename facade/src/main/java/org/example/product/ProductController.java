package org.example.product;

import org.example.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    public Result addNewProduct(@RequestBody ProductDTO productDTO) {
        productService.addNewProduct(productDTO);
        return Result.ok(productDTO);
    }
}
