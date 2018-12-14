package ru.sbrf.sandbox.practice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME", length = 30)
    private String name;

    @OneToMany (mappedBy="category")
    private Collection<Product> products;

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

    public Collection<Product> getProducts() {

        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
