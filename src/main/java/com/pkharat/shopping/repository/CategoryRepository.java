package com.pkharat.shopping.repository;

import com.pkharat.shopping.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
