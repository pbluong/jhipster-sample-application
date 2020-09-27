package com.selfstudy.jhipster.sample.web.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.selfstudy.jhipster.sample.model.Product;
import com.selfstudy.jhipster.sample.service.ProductService;
import com.selfstudy.jhipster.sample.web.rest.dto.RestProductDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class RestProductController {
    private ProductService productService;

    public RestProductController(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/{productId}")
    public ResponseEntity<RestProductDTO> getFirstProduct(@PathVariable(value = "productId") Long productId) {
        final Product product = productService.getProduct(productId);
        final RestProductDTO rs = new RestProductDTO();
        BeanUtils.copyProperties(product, rs);
        return ResponseEntity.ok(rs);
    }
}
