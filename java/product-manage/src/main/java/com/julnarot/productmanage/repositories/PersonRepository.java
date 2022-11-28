package com.julnarot.productmanage.repositories;

import com.julnarot.productmanage.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Customer, Long> {
}
