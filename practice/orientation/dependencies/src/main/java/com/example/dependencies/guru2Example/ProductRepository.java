package com.example.dependencies.guru2Example;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
   public Product getProduct(Long ID) {
     Product product = new Product();
     product.setDescription("https://www.youtube.com/watch?v=sNN9VHm6AlE");
     return product;
   }
}
