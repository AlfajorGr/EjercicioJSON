package com.example.json.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @JsonProperty("ProductID")
    private String productID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Category")
    private String category;
}
