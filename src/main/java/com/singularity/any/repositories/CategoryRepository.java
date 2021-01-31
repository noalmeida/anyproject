package com.singularity.any.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.singularity.any.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
