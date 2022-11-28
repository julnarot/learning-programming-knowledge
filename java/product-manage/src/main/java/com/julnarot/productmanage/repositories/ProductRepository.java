package com.julnarot.productmanage.repositories;

import com.julnarot.productmanage.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
