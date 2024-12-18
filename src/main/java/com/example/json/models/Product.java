package com.example.json.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {
    // ANOTACION DE COMO LEERA EL JSON CUANDO SE MAPEE
    @JsonProperty("ProductID")
    private String productID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Category")
    private String category;
}
