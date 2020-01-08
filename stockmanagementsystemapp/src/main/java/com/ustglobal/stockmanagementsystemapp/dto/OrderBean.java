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
@Table(name = "Order_Info")
public class OrderBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private double totalPrice;
	
	@Column
	private double totalPriceWithGST;
	
	@ManyToMany
	private List<ProductBean> productBean;
}
