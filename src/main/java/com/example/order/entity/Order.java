package com.example.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String productname;
    public Integer customer_id;

    @JsonFormat(pattern="dd-MM-yyyy")
    public Date ordered_date;

    public Integer quantity;
    public Integer price;
}