package com.singularity.any.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.singularity.any.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
