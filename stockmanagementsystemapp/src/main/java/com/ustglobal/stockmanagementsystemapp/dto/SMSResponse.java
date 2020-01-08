package com.ustglobal.stockmanagementsystemapp.dto;

import java.util.List;

import lombok.Data;

@Data
public class SMSResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<ProductBean> productBeans;
	private ProductBean productBean;

}
