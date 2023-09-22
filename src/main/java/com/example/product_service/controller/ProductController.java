package com.example.product_service.controller;

import com.example.product_service.service.ProductService;
import com.example.product_service.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/products")
@RestController
public class ProductController {
    @GetMapping()
    public String getAllProducts(){
        return "Getting all products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){
        return "Returning Single Product with id : "+productId;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Adding new product " + productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {
        return "Updating product";
    }


    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Deleting a product with id: " + productId;
    }
}
