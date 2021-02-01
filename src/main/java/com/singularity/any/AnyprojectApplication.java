package com.singularity.any;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.singularity.any.domain.Category;
import com.singularity.any.domain.Product;
import com.singularity.any.repositories.CategoryRepository;
import com.singularity.any.repositories.ProductRepository;

@SpringBootApplication
public class AnyprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnyprojectApplication.class, args);
	}
	
    @Autowired
	public CategoryRepository  categoryRepository;
    
    @Autowired
    public ProductRepository productRepository;
    
	@Override
	public void run(String... args) throws Exception {
		Category cat1 =  new Category(null, "Computing");
		Category cat2 = new Category(null, "Office");
		
		Product p1 = new Product(null, "computer", 2000.00);
		Product p2 = new Product(null, "printer", 800.59);
		Product p3 = new Product(null, "mouse", 80.00);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
		
	}

}
