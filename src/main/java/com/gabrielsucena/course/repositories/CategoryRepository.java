package com.gabrielsucena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsucena.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
