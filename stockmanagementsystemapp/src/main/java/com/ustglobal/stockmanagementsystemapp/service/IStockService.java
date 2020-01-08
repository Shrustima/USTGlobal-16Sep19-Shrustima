package com.ustglobal.stockmanagementsystemapp.service;

import java.util.List;

import com.ustglobal.stockmanagementsystemapp.dto.ProductBean;

public interface IStockService {

	public ProductBean searchByName(String name);
	public List<ProductBean> searchByCategory(String category);
	public List<ProductBean> searchByCompany(String company);
	public boolean addProduct(ProductBean productBean);
	public boolean updateProduct(ProductBean productBean);
	public boolean addToCart(ProductBean productBean, int itemCount);
	
}
