package com.security.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.jwt.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
