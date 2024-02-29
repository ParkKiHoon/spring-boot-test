package com.example.test.data.service;

import com.example.test.data.dto.ProductDTO;
import org.springframework.stereotype.Service;


public interface ProductService {
    ProductDTO getProduct(String productId);

    ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);
}
