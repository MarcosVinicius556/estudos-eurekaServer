package com.dev.marcos.webclient.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.marcos.webclient.dto.ProductDTO;


@Component
@FeignClient( 
    name = "server",
    path = "/products"
)
public interface ProductFeignClient {
    
    @GetMapping
    ResponseEntity<ProductDTO> findProduct();

}
