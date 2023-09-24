package com.example.product_service.service;

import com.example.product_service.dtos.ProductDto;
import com.example.product_service.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getSingleProduct(@PathVariable("productId") Long productId);
    Product addNewProduct(@RequestBody ProductDto productDto);
    Product updateProduct(@PathVariable("productId") Long productId);
    boolean deleteProduct(@PathVariable("productId") Long productId);
}
