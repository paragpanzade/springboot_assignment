package com.example.product_demo.service;
import com.example.product_demo.entity.Product;
import java.util.List;

public interface ProductService {

    public Product createProduct(Product product);

    public List<Product> readProduct();

    public String updateProduct(Long id, Product product);

    public String deleteProduct(Long id);
}
