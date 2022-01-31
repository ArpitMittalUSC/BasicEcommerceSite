package org.basic.ecommerce.serviceImpl;

import java.util.ArrayList;

import org.basic.ecommerce.dto.CartDetailsDTO;
import org.basic.ecommerce.dto.ProductDetailsDTO;
import org.basic.ecommerce.service.CartService;

public class CartServiceImpl implements CartService {

	@Override
	public CartDetailsDTO getSessionCart() {
		// TODO Auto-generated method stub
		CartDetailsDTO cart = new CartDetailsDTO();

		ArrayList<ProductDetailsDTO> productsList = new ArrayList<ProductDetailsDTO>();

		ProductDetailsDTO product = new ProductDetailsDTO();
		product.setTitle("ProductTitle1");
		product.setDescription("This is product description 1");
		product.setPrice(100);
		product.setImage("s3/img/product1image");
		product.setSkuid("P0001");
		ArrayList<String> reviews = new ArrayList<String>();
		reviews.add("Product1Review1");
		reviews.add("Product1Review2");
		reviews.add("Product1Review3");
		product.setReviews(reviews);
		product.setReviewCount(reviews.size());

		ProductDetailsDTO product2 = new ProductDetailsDTO();
		product2.setTitle("ProductTitle2");
		product2.setDescription("This is product description 2");
		product2.setPrice(200);
		product2.setImage("s3/img/product2image");
		product2.setSkuid("P0002");
		ArrayList<String> reviews2 = new ArrayList<String>();
		reviews2.add("Product2Review1");
		reviews2.add("Product2Review2");
		product2.setReviews(reviews2);
		product2.setReviewCount(reviews2.size());

		ProductDetailsDTO product3 = new ProductDetailsDTO();
		product3.setTitle("ProductTitle3");
		product3.setDescription("This is product description 3");
		product3.setPrice(130);
		product3.setImage("s3/img/product3image");
		product3.setSkuid("P0003");
		ArrayList<String> reviews3 = new ArrayList<String>();
		reviews3.add("Product3Review1");
		reviews3.add("Product3Review3");
		reviews3.add("Product3Review4");
		reviews3.add("Product3Review2");
		product3.setReviews(reviews3);
		product3.setReviewCount(reviews3.size());

		productsList.add(product);
		productsList.add(product2);
		productsList.add(product3);

		cart.setProducts(productsList);
		cart.setTotalAmount(430);

		return cart;
	}

}
