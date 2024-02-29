package com.example.test.data.handler;

import com.example.test.data.entity.ProductEntity;

public interface ProductDataHandler {


    ProductEntity getProductEntity(String productId);

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
}
