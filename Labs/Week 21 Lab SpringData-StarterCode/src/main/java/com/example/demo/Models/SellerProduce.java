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
@Table(name="SellerProduce")
@EntityListeners(AuditingEntityListener.class)

public class SellerProduce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="seller")
    private User seller;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produce")
    private Produce produce;

    int quantity;

    int price;

    public SellerProduce() {
    }

    public SellerProduce(User seller, Produce produce, int quantity, int price) {
        this.seller = seller;
        this.produce = produce;
        this.quantity = quantity;
        this.price = price;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public Long getID() {
        return id;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getSeller() {
        return seller;
    }

    public void setProduce(Produce produce) {
        this.produce = produce;
    }

    public Produce getProduce() {
        return produce;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    
}
