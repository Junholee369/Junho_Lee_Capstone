package com.example.Inventory_Management_Capstone.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.Inventory_Management_Capstone.Entity.Product;
import com.example.Inventory_Management_Capstone.Service.ProductService;




@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	//handler method to handle list Product and return model and view
	@GetMapping("/products")
	public String listProducts(Model model) {
		List<Product> products =productService.getAllProducts();
		
		model.addAttribute("listProducts", products);
		return "products";
	}
	

	@GetMapping("/products/new")
	public String createProductForm(Model model) {		
		
		//create product object to hold product form data
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_Product";
	}
	
	
	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") Product product) {
		//save product to the database
		productService.addProduct(product);
		return "redirect:/products";
	}
	
	@GetMapping("/products/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_Product";
	}
	
	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable Long id, 
			@ModelAttribute("product") Product product,
			Model model) {
		
		//get product from database by id
		Product existingProduct = productService.getProductById(id);
		existingProduct.setProductId(id);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductDescription(product.getProductDescription());
		existingProduct.setProductPrice(product.getProductPrice());
		existingProduct.setProductQuantity(product.getProductQuantity());
		
		//save updated Product
		productService.updateProduct(existingProduct);
		return "redirect:/products";
	}	
	
	@GetMapping("/products/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "redirect:/products";
	}
	
	
	
}