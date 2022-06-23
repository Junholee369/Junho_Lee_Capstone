package com.example.Inventory_Management_Capstone.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Inventory_Management_Capstone.Entity.User;
import com.example.Inventory_Management_Capstone.Web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}