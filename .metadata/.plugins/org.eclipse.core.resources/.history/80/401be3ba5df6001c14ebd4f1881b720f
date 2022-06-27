package com.example.Inventory_Management_Capstone.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Inventory_Management_Capstone.Entity.Product;
import com.example.Inventory_Management_Capstone.Repository.ProductRepository;



@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
	return productRepository.findAll();
	}

	
	//get one product
	@Override
	public Product getProductById(long productId) {
		return productRepository.findById(productId).get();
	}

	
	//add new product
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);		
	}

	
	//delete a product
	@Override
	public void deleteProduct(long productId) {
		 productRepository.deleteById(productId);
	}

	//update a product
	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

}

