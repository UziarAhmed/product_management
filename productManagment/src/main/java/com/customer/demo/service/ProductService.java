package com.customer.demo.service;


import java.util.List;

import com.customer.demo.dto.ProductRequestDto;
import com.customer.demo.entity.Product;



public interface ProductService {
	String addProduct(ProductRequestDto prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
	List<Product> viewAllProducts();
}