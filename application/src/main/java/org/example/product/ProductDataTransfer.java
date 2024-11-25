package org.example.product;

public class ProductDataTransfer {

    public static ProductBO DOtoBO(ProductDO productDO) {
        ProductBO bo = new ProductBO();
        bo.setId(productDO.getId());
        bo.setName(productDO.getName());
        bo.setPrice(productDO.getPrice().toString());
        bo.setDesc(productDO.getDesc());
        return bo;
    }

    public static ProductDO DTOtoDO(ProductDTO dto) {
        return ProductDO
            .newBuilder()
            .id(Long.parseLong(dto.getId()))
            .name(dto.getName())
            .desc(dto.getDesc())
            .price(dto.getPrice())
            .build();
    }
}
