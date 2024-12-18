package com.example.json.controllers;

import com.example.json.models.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductControllerDTO {

    @GetMapping("/api/products")
    public List<ProductDTO> products(){

        List<ProductDTO> products = new ArrayList<>();
        products.add(new ProductDTO("P001", "Laptop", "Electronics"));
        products.add(new ProductDTO("P001", null, "Electronics"));
        products.add(new ProductDTO("P002", "Notebook", "Stationery"));
        products.add(new ProductDTO("P002", null, "Stationery"));

        List<ProductDTO> response = new ArrayList<>();
        if (products != null){
            products.forEach(p -> {
                if (p != null){
                    response.add(p);
                }
            });
        }
        return response;
    }
}
