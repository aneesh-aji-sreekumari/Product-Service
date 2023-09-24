package com.example.product_service.dtos;

import com.example.product_service.model.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class GetSingleProductResponseDto {
    private Product product;
}
