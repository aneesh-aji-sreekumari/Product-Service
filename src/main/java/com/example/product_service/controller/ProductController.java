package com.example.product_service.controller;

import com.example.product_service.dtos.GetSingleProductResponseDto;
import com.example.product_service.service.ProductService;
import com.example.product_service.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/products")
@RestController
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping()
    public String getAllProducts(){
        return "Getting all products";
    }

    @GetMapping("/{productId}")
    public GetSingleProductResponseDto getSingleProduct(@PathVariable("productId") Long productId){
        GetSingleProductResponseDto getSingleProductResponseDto =
                new GetSingleProductResponseDto();
        getSingleProductResponseDto.setProduct(productService.getSingleProduct(productId));
        return getSingleProductResponseDto;
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
