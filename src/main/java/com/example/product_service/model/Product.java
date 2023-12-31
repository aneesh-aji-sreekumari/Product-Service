package com.example.product_service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String title;
    private double price;
    private String description;
    private String imageUrl;
    private Category category;
}
