package com.onetomany.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "my_customer", schema ="public")
public class Customer {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String gender;
    @OneToMany (targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn (name = "cp_fk", referencedColumnName = "id")
    private List<Product> products;
}
