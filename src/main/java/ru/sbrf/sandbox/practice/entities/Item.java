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
    private int quantity;

    @Column(name = "ORDER_ID")
    @Type(type = "java.lang.Integer")
    @JoinColumn (name="ORDERS")
    private Order order;

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

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {

        return order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}
