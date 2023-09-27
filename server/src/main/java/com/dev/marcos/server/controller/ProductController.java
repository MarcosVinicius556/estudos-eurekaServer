package com.dev.marcos.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.marcos.server.dto.ProductDTO;

@RestController
@RequestMapping( "/products" )
public class ProductController {
    

    @GetMapping
    public ResponseEntity<ProductDTO> findProduct() {
        return ResponseEntity.ok().body(new ProductDTO("Notebook", 4500.0));
    }

}
