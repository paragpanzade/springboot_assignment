package com.example.product_demo.serviceImpl;

import com.example.product_demo.entity.Product;
import com.example.product_demo.repository.ProductRepository;
import com.example.product_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> readProduct() {
        return productRepository.findAll();
    }

    @Override
    public String updateProduct(Long id, Product product) {
        String msg="";
        Optional<Product> currentProduct = productRepository.findById(id);
        if (currentProduct.isPresent()){
            productRepository.save(product);
            msg = "Product Updated Successfully!";
        }
        else
            msg = "Record Not Found!!";
        return msg;
    }

    @Override
    public String deleteProduct(Long id){
        String msg="";
        Optional<Product> currentProduct = productRepository.findById(id);
        if (currentProduct.isPresent()){
            productRepository.deleteById(id);
            msg = "Product with ID "+id+" deleted Successfully!";
        }
        else
            msg = "Record Not Found!!";
        return msg;
    }


}
