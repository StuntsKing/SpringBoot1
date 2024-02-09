package com.rodrigoamaro.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigoamaro.project.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}