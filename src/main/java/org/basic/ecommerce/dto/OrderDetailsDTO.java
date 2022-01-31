package org.basic.ecommerce.dto;

import java.util.Date;
import java.util.List;

public class OrderDetailsDTO {
	private long totalAmount;
	private long totalQuantity;
	private List<ProductDetailsDTO> products;
	private String orderId;
	private UserDetailDTO user;
	private Date placedAt;
	private UserDetailDTO seller;

	public UserDetailDTO getUser() {
		return user;
	}

	public void setUser(UserDetailDTO user) {
		this.user = user;
	}

	public UserDetailDTO getSeller() {
		return seller;
	}

	public void setSeller(UserDetailDTO seller) {
		this.seller = seller;
	}

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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getPlacedAt() {
		return placedAt;
	}

	public void setPlacedAt(Date placedAt) {
		this.placedAt = placedAt;
	}

	public long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
}
