package com.np.products.service;

import com.np.products.entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    void createProduct(Product product);

    String modifyProduct(long id, Product product);

    String deleteProduct(long id);
}
