package ru.sbrf.sandbox.practice.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "CATEGORY_ID")
    @Type(type = "java.lang.Integer")
    @JoinColumn (name="CATEGORY")
    private Category category;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "PRICE")
    private double price;

    @ManyToMany
    @JoinTable(name="TAGGED",
            joinColumns=@JoinColumn(name="PRODUCT_ID"),
            inverseJoinColumns=@JoinColumn(name="TAG_ID"))
    private List<Tag> tags;

    @OneToMany (mappedBy="product")
    private Collection<Item> items;

    public void setItems(Collection<Item> items) {
        this.items = items;
    }

    public Collection<Item> getItems() {

        return items;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
