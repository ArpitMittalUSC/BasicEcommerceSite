package org.basic.ecommerce.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.basic.ecommerce.dto.ProductDetailsDTO;
import org.basic.ecommerce.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public List<ProductDetailsDTO> getProducts() {
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
		product.setSellerId("U003");
		
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
		product2.setSellerId("U003");
		
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
		product3.setSellerId("U004");
		
		productsList.add(product);
		productsList.add(product2);
		productsList.add(product3);

		return productsList;
	}

	@Override
	public ProductDetailsDTO getProductBySkuId(String skuId) {
		ProductDetailsDTO product = new ProductDetailsDTO();
		if (skuId.equals("P0001")) {

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

		} else if (skuId.equals("P0002")) {
			product.setTitle("ProductTitle2");
			product.setDescription("This is product description 2");
			product.setPrice(200);
			product.setImage("s3/img/product2image");
			product.setSkuid("P0002");
			ArrayList<String> reviews2 = new ArrayList<String>();
			reviews2.add("Product2Review1");
			reviews2.add("Product2Review2");
			product.setReviews(reviews2);
			product.setReviewCount(reviews2.size());
		} else if (skuId.equals("P0003")) {
			product.setTitle("ProductTitle3");
			product.setDescription("This is product description 3");
			product.setPrice(130);
			product.setImage("s3/img/product3image");
			product.setSkuid("P0003");
			ArrayList<String> reviews3 = new ArrayList<String>();
			reviews3.add("Product3Review1");
			reviews3.add("Product3Review3");
			reviews3.add("Product3Review4");
			reviews3.add("Product3Review2");
			product.setReviews(reviews3);
			product.setReviewCount(reviews3.size());
		}

		else {
			product.setTitle("ProductTitle");
			product.setDescription("This is product description");
			product.setPrice(1000);
			product.setImage("s3/img/product1image");
			product.setSkuid("P0000");
			ArrayList<String> reviews = new ArrayList<String>();
			reviews.add("ProductReview1");
			reviews.add("ProductReview2");
			reviews.add("ProductReview3");
			product.setReviews(reviews);
			product.setReviewCount(reviews.size());
		}
		return product;
	}

}
