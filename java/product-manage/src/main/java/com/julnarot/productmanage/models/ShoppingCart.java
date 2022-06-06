package com.julnarot.productmanage.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ShoppingCart {

    @Id
    @SequenceGenerator(
            name = "shopping_cart_sequence",
            sequenceName = "shopping_cart_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "shopping_cart_sequence")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    private float quantity;
    private float unitaryPrice;

}
