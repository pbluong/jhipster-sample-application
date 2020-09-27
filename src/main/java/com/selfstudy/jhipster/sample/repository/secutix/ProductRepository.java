package com.selfstudy.jhipster.sample.repository.secutix;

import com.selfstudy.jhipster.sample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
