package org.basic.ecommerce.facade;

import java.util.List;

import org.basic.ecommerce.dto.ProductDetailsDTO;

public interface ProductFacade {

	public List<ProductDetailsDTO> getProducts();
	
	public List<ProductDetailsDTO> getProductsForSeller(String sellerId);
	
	public ProductDetailsDTO getProductBySkuId(String skuId);
}
