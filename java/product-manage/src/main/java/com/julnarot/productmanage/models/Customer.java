package com.julnarot.productmanage.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

@Entity
@Data
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence")
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "customer",
            fetch = FetchType.LAZY) // cascade = CascadeType.ALL
    private Set<ShoppingCart> shoppingsCart = new HashSet<>();

}

