package com.singularity.any.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singularity.any.domain.Category;
import com.singularity.any.repositories.CategoryRepository;
import com.singularity.any.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category buscar(Integer id) {
		Optional<Category> obg =  repo.findById(id);
		return obg.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found, ID: " + id + "tipo: " + Category.class.getName() ));
		
	}

}
