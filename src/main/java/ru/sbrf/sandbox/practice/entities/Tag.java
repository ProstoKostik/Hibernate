package ru.sbrf.sandbox.practice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TAG")
public class Tag implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME", length = 20)
    private String name;

    @ManyToMany
    @JoinTable(name="TAGGED",
            joinColumns=@JoinColumn(name="TAG_ID"),
            inverseJoinColumns=@JoinColumn(name="PRODUCT_ID"))
    private List<Product> products;

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
