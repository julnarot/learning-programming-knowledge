package com.julnarot.productmanage.models;

import lombok.Data;

import javax.persistence.*;

import java.util.Set;
import java.util.HashSet;

@Entity
@Data
public class TypeProduct {
    @Id
    @SequenceGenerator(
            name = "type_product_sequence",
            sequenceName = "type_product_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "type_product_sequence")
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "typeProduct",
            fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>();
}
