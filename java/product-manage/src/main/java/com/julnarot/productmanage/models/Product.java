package com.julnarot.productmanage.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_sequence")
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_product_id")
    private TypeProduct typeProduct;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "product",
            fetch = FetchType.LAZY)
    private Set<ShoppingCart> shoppingsCart = new HashSet<>();

    private float quantity;
    private float costUnit;
}
