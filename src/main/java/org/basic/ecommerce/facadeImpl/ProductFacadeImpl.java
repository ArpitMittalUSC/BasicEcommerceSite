package org.basic.ecommerce.facadeImpl;

import java.util.List;

import javax.annotation.Resource;

import org.basic.ecommerce.dto.ProductDetailsDTO;
import org.basic.ecommerce.facade.ProductFacade;
import org.basic.ecommerce.service.ProductService;

public class ProductFacadeImpl implements ProductFacade{
	
	@Resource(name = "productService")
	private ProductService productService;

	@Override
	public List<ProductDetailsDTO> getProducts() {
		return productService.getProducts();
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public ProductDetailsDTO getProductBySkuId(String skuId) {
		return productService.getProductBySkuId(skuId);
	}

	@Override
	public List<ProductDetailsDTO> getProductsForSeller(String sellerId) {
		//change this 
		return productService.getProducts();
	}
	
	
}
