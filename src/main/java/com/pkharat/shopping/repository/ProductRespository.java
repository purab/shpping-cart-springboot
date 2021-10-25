package com.pkharat.shopping.repository;

import com.pkharat.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRespository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_Id(int id);
}
