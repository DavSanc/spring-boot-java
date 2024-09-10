package com.dailycodework1.dreamshops.repository;

import com.dailycodework1.dreamshops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
