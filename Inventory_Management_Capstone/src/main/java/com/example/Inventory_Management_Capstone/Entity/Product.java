package com.example.Inventory_Management_Capstone.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)	
private long productId;

@Column(nullable = false)
private String productName;

@Column(nullable = false)
private String productDescription;

@Column(nullable = false)
private Double productPrice;

@Column(nullable = false)
private int productQuantity;


//allows the user to be able to choose from a a list of category
//@ManyToOne
//@JoinColumn(name = "category", nullable = false)
//private List<Category> catName;



@Column(nullable = false)
@DateTimeFormat(pattern="yyy-MM-dd")
private Date productDate;

@PrePersist
protected void onCreate() {this.productDate=new Date();}

}