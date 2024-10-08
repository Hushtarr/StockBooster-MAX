package com.stockboostermax.product.client;

import com.stockboostermax.product.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product",url = "https://dummyjson.com")
public interface ProductClient {

    @GetMapping("/products/{id}")
    ProductDTO getProductById(@PathVariable Long id);
}
