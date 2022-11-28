package com.julnarot.productmanage.repositories;

import com.julnarot.productmanage.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    @Query("SELECT sc, c, p, tp from ShoppingCart sc left join Customer c on c = sc left join Product p on p = sc left join TypeProduct tp on tp = p")
    List<ShoppingCart> getAllShoppingsCart();

    @Query("SELECT sc,c from ShoppingCart sc left join Customer c on c = sc left join Product p on p=sc left join TypeProduct tp on tp = sc ")
    List<ShoppingCart> getShoppingCartByCustomerId(Long id);
}
