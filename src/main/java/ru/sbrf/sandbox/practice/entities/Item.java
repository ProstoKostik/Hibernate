package ru.sbrf.sandbox.practice.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ITEM")
public class Item implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "QTY")
    private int qty;

    @Column(name = "ORDER_ID")
    @Type(type = "java.lang.Integer")
    @JoinColumn (name="ORDERS")
    private Orders orders;

    @Column(name = "PRODUCT_ID")
    @Type(type = "java.lang.Integer")
    @JoinColumn (name="PRODUCT")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Orders getOrders() {

        return orders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }
}
