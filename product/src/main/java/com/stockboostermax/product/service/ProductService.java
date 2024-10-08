package com.stockboostermax.product.service;


import com.stockboostermax.product.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> findAll();
    ProductDTO findById(Long id);
    void save(ProductDTO productDTO);
    void update(Long id ,ProductDTO productDTO);
    void delete(Long id);
}
