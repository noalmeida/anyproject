package com.singularity.any;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.singularity.any.domain.Category;
import com.singularity.any.repositories.CategoryRepository;

@SpringBootApplication
public class AnyprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnyprojectApplication.class, args);
	}
    @Autowired
	public CategoryRepository  categoryRepository;
	@Override
	public void run(String... args) throws Exception {
		Category cat1 =  new Category(null, "Computing");
		Category cat2 = new Category(null, "Office");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		
		
		
	}

}
