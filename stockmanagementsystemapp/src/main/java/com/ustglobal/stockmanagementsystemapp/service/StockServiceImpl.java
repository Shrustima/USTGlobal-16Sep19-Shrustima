package com.ustglobal.stockmanagementsystemapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagementsystemapp.dao.IStockDAO;
import com.ustglobal.stockmanagementsystemapp.dto.ProductBean;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	private IStockDAO dao;
	
	@Override
	public ProductBean searchByName(String name) {
		return dao.searchByName(name);
	}

	@Override
	public List<ProductBean> searchByCategory(String category) {
		return dao.searchByCategory(category);
	}

	@Override
	public List<ProductBean> searchByCompany(String company) {
		return dao.searchByCompany(company);
	}

	@Override
	public boolean addProduct(ProductBean productBean) {
		return dao.addProduct(productBean);
	}

	@Override
	public boolean updateProduct(ProductBean productBean) {
		return dao.updateProduct(productBean);
	}

	@Override
	public boolean addToCart(ProductBean productBean, int itemCount) {
		return dao.addToCart(productBean, itemCount);
	}

}
