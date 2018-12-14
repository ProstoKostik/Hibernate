package ru.sbrf.sandbox.practice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "SHIPPING_ADDRESS")
public class ShippingAddress implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "CITY", length = 30)
    private String city;

    @Column(name = "STREET", length = 50)
    private String street;

    @OneToMany (mappedBy="shippingAddress")
    private Collection<Orders> orders;

    public void setOrders(Collection<Orders> orders) {
        this.orders = orders;
    }

    public Collection<Orders> getOrders() {

        return orders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
