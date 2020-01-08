package com.ustglobal.stockmanagementsystemapp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Products_Info")
public class ProductBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String category;
	
	@Column
	private String company;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
	
	@ManyToMany(mappedBy = "productBean")
	private List<OrderBean> orderBean;
	
}
