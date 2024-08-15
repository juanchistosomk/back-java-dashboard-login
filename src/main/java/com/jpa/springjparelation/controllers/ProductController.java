package com.jpa.springjparelation.controllers;

import com.jpa.springjparelation.entities.Product;
import com.jpa.springjparelation.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @Autowired
    public ProductService productService;


    @GetMapping("/product/{id}")
    public Product getOneProduct(@PathVariable int id){
        return null;
    }

    @GetMapping("/product")
    public Product getAllProduct(){
        return null;
    }

    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product){
        return null;
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable int id){
        return null;
    }

    @DeleteMapping("/product/{id}")
    public Product deleteProduct(@PathVariable int id){
        return null;
    }



}
