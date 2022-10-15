package com.snackoverflow.yelproulette;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "price")
    private float price;

    // getter, setters, contructors
}