package com.julnarot.productmanage.repositories;

import com.julnarot.productmanage.models.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
}
