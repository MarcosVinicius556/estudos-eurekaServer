package com.dev.marcos.webclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.marcos.webclient.dto.ProductDTO;
import com.dev.marcos.webclient.feignclients.ProductFeignClient;

@RestController
@RequestMapping
public class HomeController {
    
    @Autowired
    private ProductFeignClient feignClient;

    @GetMapping
    public ProductDTO findProduct() {
        return feignClient.findProduct().getBody();
    }

}
