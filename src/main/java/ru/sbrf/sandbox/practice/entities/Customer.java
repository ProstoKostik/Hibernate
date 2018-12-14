package ru.sbrf.sandbox.practice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "SURNAME", length = 50)
    private String surname;

    @OneToMany (mappedBy="customer")
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
