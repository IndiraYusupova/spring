package com.onetomany.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "my_product", schema ="public")
public class Product {
    @Id
    @Column
    private int pid;
    @Column
    private String productName;
    @Column
    private int quantity;
    @Column
    private int price;

}
