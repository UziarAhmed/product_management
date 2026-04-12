package com.customer.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.demo.entity.Product;


public interface ProductRepository 

			extends JpaRepository<Product, Long>{

} //https://github.com/deep473/product_management.git