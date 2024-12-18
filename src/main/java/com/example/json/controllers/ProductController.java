package com.example.json.controllers;

import com.example.json.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ProductController {

    @GetMapping("/")
    public List<Map<String, Object>> getProducts(){

        List<Map<String, Object>> productos = new ArrayList<>();

        Map<String, Object> product1 = new HashMap<>();
        product1.put("ProductID", "P001");
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");

        Map<String, Object> product2 = new HashMap<>();
        product2.put("ProductID", "P002");
        product2.put("Name", "Notebook");
        product2.put("Category", "Stationery");

        productos.add(product1);
        productos.add(product2);

        // VALIDACION POR SI VIENE NULL ALGUN PRODUCTO
        List<Map<String, Object>> response = new ArrayList<>();
        productos.forEach(product -> {
            if (product != null ){
                response.add(product);
            }
        });

        return response;
    }
}
