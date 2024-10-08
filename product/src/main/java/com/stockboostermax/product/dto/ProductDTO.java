package com.stockboostermax.product.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    @JsonProperty("title")
    private String name;

//    @JsonIgnore
//    private CategoryDTO category;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("description")
    private String description;

    @JsonProperty("stock")
    private Integer stockQuantity;

//    private String origin;

//    private List<Vendor> supplier;

//    private String imageUrl;
//
    @JsonProperty("rating")
    private Double rating;
}
