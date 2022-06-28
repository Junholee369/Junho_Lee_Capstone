package com.example.Inventory_Management_Capstone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Inventory_Management_Capstone.Entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
