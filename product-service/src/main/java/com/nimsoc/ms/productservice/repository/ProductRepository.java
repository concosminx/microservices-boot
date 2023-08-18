package com.nimsoc.ms.productservice.repository;

import com.nimsoc.ms.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
