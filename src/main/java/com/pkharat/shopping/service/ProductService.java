package com.pkharat.shopping.service;

import com.pkharat.shopping.model.Product;
import com.pkharat.shopping.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRespository productRespository;

    public List<Product> getAllProduct() {return productRespository.findAll();}
    public void addProduct(Product product) {productRespository.save(product);}
    public void removeProduct(long id) {productRespository.deleteById(id);}
    public Optional<Product> getProductById(long id) {return productRespository.findById(id);}

    public List<Product> getAllProductsByCategoryId(int categoryId) {
        return productRespository.findAllByCategory_Id(categoryId);
    }

}
