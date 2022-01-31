package org.basic.ecommerce.dto;

import java.util.List;

public class CartDetailsDTO {
	private long totalAmount;
	private List<ProductDetailsDTO> products;

	public long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<ProductDetailsDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDetailsDTO> products) {
		this.products = products;
	}
}
