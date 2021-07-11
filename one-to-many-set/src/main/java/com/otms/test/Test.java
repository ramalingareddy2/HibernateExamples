package com.otms.test;

import java.util.HashSet;
import java.util.Set;

import com.otms.dao.ProductDao;
import com.otms.entities.Product;
import com.otms.entities.Review;

public class Test {
	public static void main(String[] args) {
		ProductDao productDao=new ProductDao();
		
//		Review review=Review.builder().comment("Product is not good").description("Not looks as expected").rating(1.0f).build();
//		Review review1=Review.builder().comment("Good Product").description("Nice One").rating(5.0f).build();
//		
//		productDao.saveReview(review);
//		productDao.saveReview(review1);
//		
//		Product product=new Product();
//		product.setPrice(1000);
//		product.setProductDescription("Mac Book Pro");
//		product.setProductName("Mac Book Pro M1");
//		Set<Review> reviews=new HashSet<>();
//		reviews.add(review);
//		reviews.add(review1);
//		product.setReviews(reviews);
//		
//		productDao.saveProduct(product);
		Review review=productDao.findReview(1);
		System.out.println(review);
		Product product=productDao.findProduct(1);
		System.out.println(product);
		
	}
	
	

}
