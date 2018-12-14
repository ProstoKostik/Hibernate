package ru.sbrf.sandbox.practice.entities;

import org.hibernate.annotations.Type;
import org.hibernate.type.DateType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "ORDERS")
public class Orders implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "CUSTOMER_ID")
    @Type(type = "java.lang.Integer")
    @JoinColumn (name="CUSTOMER")
    private Customer customer;

    @Column(name = "SHIPPING_ADDRESS_ID")
    @Type(type = "java.lang.Integer")
    @JoinColumn (name="SHIPPING_ADDRESS")
    private ShippingAddress shippingAddress;

    @OneToMany (mappedBy="orders")
    private Collection<Item> items;

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public Collection<Item> getItems() {
        return items;
    }

    @Column(name = "DATE")
    private DateType dateType;

    @Column(name = "NUMBER", length = 20)
    private String number;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateType(DateType dateType) {
        this.dateType = dateType;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public DateType getDateType() {
        return dateType;
    }

    public String getNumber() {
        return number;
    }
}
