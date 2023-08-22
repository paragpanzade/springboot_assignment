package com.example.product_demo.controller;

import com.example.product_demo.entity.Product;
import com.example.product_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/createproduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.ok().body(this.productService.createProduct(product));
    }

    @GetMapping("/readproduct")
    public List<Product> readProduct(){
        return this.productService.readProduct();
    }

    @PutMapping("/updateproduct/{id}")
    public String updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return this.productService.updateProduct(id, product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        return this.productService.deleteProduct(id);
    }
}
