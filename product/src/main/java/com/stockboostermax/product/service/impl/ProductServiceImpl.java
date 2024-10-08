package com.stockboostermax.product.service.impl;


import com.stockboostermax.product.client.ProductClient;
import com.stockboostermax.product.dto.ProductDTO;
import com.stockboostermax.product.exception.ProductNotFoundException;
import com.stockboostermax.product.repository.ProductRepository;
import com.stockboostermax.product.service.ProductService;
import com.stockboostermax.product.util.MapperTool;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final MapperTool mapper;
    private final ProductClient productClient;

    @Override
    public List<ProductDTO> findAll() {
        return List.of();
    }

    @Override
    public ProductDTO findById(Long id) {
        try {
            return productClient.getProductById(id);
        }
        catch(ProductNotFoundException exception) {
            throw new ProductNotFoundException("Product not found");
        }
    }

    @Override
    public void save(ProductDTO productDTO) {

    }

    @Override
    public void update(Long id, ProductDTO productDTO) {

    }

    @Override
    public void delete(Long id) {

    }
}
