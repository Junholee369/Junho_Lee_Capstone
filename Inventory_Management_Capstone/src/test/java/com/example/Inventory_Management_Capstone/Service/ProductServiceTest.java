package com.example.Inventory_Management_Capstone.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Inventory_Management_Capstone.Entity.Product;


@SpringBootTest
public class ProductServiceTest {

	@Autowired
	public ProductService productService;
	
	@Test
	public void testAddProduct() throws Exception{
				
		Product testProduct = new Product();
	
		testProduct.setProductName("TestProduct");
		testProduct.setProductDescription("Testing product");
		testProduct.setProductPrice(13.0);
		testProduct.setProductQuantity(3);

		productService.addProduct(testProduct);
		
		
		assertEquals("TestProduct",testProduct.getProductName());
		assertEquals("Testing product", testProduct.getProductDescription());
		assertEquals(13.0, testProduct.getProductPrice());
		assertEquals(3, testProduct.getProductQuantity());
		productService.deleteProduct(testProduct.getProductId());		
	}
	

	
	
}
