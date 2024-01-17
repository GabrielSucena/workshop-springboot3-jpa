package com.gabrielsucena.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielsucena.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
