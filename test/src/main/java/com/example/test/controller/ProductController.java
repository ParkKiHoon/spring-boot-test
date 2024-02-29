package com.example.test.controller;

import com.example.test.data.dto.ProductDTO;
import com.example.test.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/product/{productId}")
    public ProductDTO getProduct(@PathVariable String productId){
        return  productService.getProduct(productId);
    }

    @PostMapping("/product")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO)
    {
        String productId=productDTO.getProductId();
        String productName=productDTO.getProductName();
        int productPrice=productDTO.getProductPrice();
        int productStock=productDTO.getProductStock();

        return productService.saveProduct(productId,productName,productPrice,productStock);
    }

    @DeleteMapping("/product/{productId}")
    public ProductDTO deleteProduct(@PathVariable String productId){
        return null;
    }
}
