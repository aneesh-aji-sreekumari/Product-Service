package com.example.product_service.service;

import com.example.product_service.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

public interface ProductService {

    String getAllProducts();
    String getSingleProduct(@PathVariable("productId") Long productId);
    String addNewProduct(@RequestBody ProductDto productDto);
    String updateProduct(@PathVariable("productId") Long productId);
    String deleteProduct(@PathVariable("productId") Long productId);
}
