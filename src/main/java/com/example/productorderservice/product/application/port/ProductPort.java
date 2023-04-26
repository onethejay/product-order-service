package com.example.productorderservice.product.application.port;

import com.example.productorderservice.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public
interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);
}
