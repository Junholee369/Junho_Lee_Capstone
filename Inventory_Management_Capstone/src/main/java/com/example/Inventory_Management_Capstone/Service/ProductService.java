package com.example.Inventory_Management_Capstone.Service;

import java.util.List;

import com.example.Inventory_Management_Capstone.Entity.Product;


public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProductById(long product_Id);
	
	public Product addProduct(Product product);
	
	public void deleteProduct(long product_Id);
	
	public Product updateProduct(Product product);
	
	
}
