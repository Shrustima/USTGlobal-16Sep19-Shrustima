package com.ustglobal.stockmanagementsystemapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagementsystemapp.dto.ProductBean;
import com.ustglobal.stockmanagementsystemapp.dto.SMSResponse;
import com.ustglobal.stockmanagementsystemapp.service.IStockService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class StockManagementController {

	@Autowired
	private IStockService service;
	
	@GetMapping(path = "/searchByName")
	public SMSResponse searchByName(@RequestParam String name) {
		SMSResponse response = new SMSResponse();
		ProductBean productBean = service.searchByName(name);
		if (productBean != null) {
			response.setStatusCode(200);
			response.setMessage("Success!");
			response.setDescription("Product found.");
			response.setProductBean(productBean);
			return response;
		} else {
			response.setStatusCode(400);
			response.setMessage("Failure!");
			response.setDescription("Product not found in catalog.");
			response.setProductBean(productBean);
			return response;
		}
	}
	
	@GetMapping(path = "/searchByCategory")
	public SMSResponse searchByCategory(@RequestParam String category) {
		SMSResponse response = new SMSResponse();
		List<ProductBean> productBean = service.searchByCategory(category);
		if (productBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success!");
			response.setDescription("Product found.");
			response.setProductBeans(productBean);
			return response;
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure!");
			response.setDescription("Product not found in catalog.");
			response.setProductBeans(productBean);
			return response;
		}
	}
	
	@GetMapping(path = "/searchByCompany")
	public SMSResponse searchByCompany(@RequestParam String company) {
		SMSResponse response = new SMSResponse();
		List<ProductBean> productBean = service.searchByCompany(company);
		if (productBean != null) {
			response.setStatusCode(202);
			response.setMessage("Success!");
			response.setDescription("Product found.");
			response.setProductBeans(productBean);
			return response;
		} else {
			response.setStatusCode(402);
			response.setMessage("Failure!");
			response.setDescription("Product not found in catalog.");
			response.setProductBeans(productBean);
			return response;
		}
	}
	
	@PostMapping(path = "/add",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
	public SMSResponse addProduct(@RequestBody ProductBean productBean) {
		SMSResponse response = new SMSResponse();
		if (service.addProduct(productBean)) {
			response.setStatusCode(203);
			response.setMessage("Success!");
			response.setDescription("Product added successfully.");
			return response;
		} else {
			response.setStatusCode(403);
			response.setMessage("Failure!");
			response.setDescription("Product not added successfully.");
			return response;
		}
	}
	
	@PostMapping(path = "/update",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
	public SMSResponse updateProduct(@RequestBody ProductBean productBean) {
		SMSResponse response = new SMSResponse();
		if (service.updateProduct(productBean)) {
			response.setStatusCode(204);
			response.setMessage("Success!");
			response.setDescription("Product updated successfully.");
			return response;
		} else {
			response.setStatusCode(404);
			response.setMessage("Failure!");
			response.setDescription("Product not updated successfully.");
			return response;
		}
	}
	
	@PostMapping(path = "/addToCart",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
	public SMSResponse addToCart(@RequestBody ProductBean productBean, @RequestParam int itemCount) {
		SMSResponse response = new SMSResponse();
		if (service.addToCart(productBean, itemCount)) {
			response.setStatusCode(205);
			response.setMessage("Success!");
			response.setDescription("Product added to cart.");
			return response;
		} else {
			response.setStatusCode(405);
			response.setMessage("Failure!");
			response.setDescription("Couldn't add product to cart.");
			return response;
		}
	}
	
}
