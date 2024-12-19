package com.raselahmedb.audit.repository;

import com.raselahmedb.audit.model.Product;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.repository.CrudRepository;

@JaversSpringDataAuditable
public interface ProductRepository extends CrudRepository<Product, Long> {}