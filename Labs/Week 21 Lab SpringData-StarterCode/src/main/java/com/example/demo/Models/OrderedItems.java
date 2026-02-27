package com.example.demo.Models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="OrderedItems")
@EntityListeners(AuditingEntityListener.class)

public class OrderedItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "order")
    private Order order;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "seller_produce")
    private SellerProduce seller_produce;

    int quantity;
    float price_at_order;

    public OrderedItems() {

    }

    public OrderedItems(Order order, SellerProduce seller_produce, int quantity, float price_at_order) {
        this.order = order;
        this.seller_produce = seller_produce;
        this.quantity = quantity;
        this.price_at_order = price_at_order;
    }

}
