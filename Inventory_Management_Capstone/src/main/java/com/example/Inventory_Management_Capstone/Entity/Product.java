package com.example.Inventory_Management_Capstone.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

@Column(nullable = false, length = 50)
private String productDescription;

@Column(nullable = false)
private Double productPrice;

@Column(nullable = false)
private int productQuantity;

@Column(nullable = false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date productDate;

@PrePersist
protected void onCreate() {this.productDate=new Date();}

}
