package com.selfstudy.jhipster.sample.service;

import com.selfstudy.jhipster.sample.model.Product;
import com.selfstudy.jhipster.sample.repository.secutix.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(Long productId) {
        return productRepository.getOne(productId);
    }
}
