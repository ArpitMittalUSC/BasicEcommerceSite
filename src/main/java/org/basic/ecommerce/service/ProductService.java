package org.basic.ecommerce.service;

import java.util.List;

import org.basic.ecommerce.dto.ProductDetailsDTO;

public interface ProductService {

	public List<ProductDetailsDTO> getProducts();

	public ProductDetailsDTO getProductBySkuId(String skuId);
}
