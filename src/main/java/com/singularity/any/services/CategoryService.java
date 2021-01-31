package com.singularity.any.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singularity.any.domain.Category;
import com.singularity.any.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category buscar(Integer id) {
		Optional<Category> obg =  repo.findById(id);
		return obg.orElse(null);
		
	}

}
