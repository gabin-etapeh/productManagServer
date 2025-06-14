package com.example.productManagement.repository;

import com.example.productManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;
public interface ProductRepository extends JpaRepository<Product, UUID> {

}
