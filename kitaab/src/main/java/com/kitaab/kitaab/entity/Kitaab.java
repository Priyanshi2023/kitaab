package com.kitaab.kitaab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "kitaab_info")
public class Kitaab {
    @Id
    private String kitaabId;
    private String Name;
    private String Author;
    private String Price;
    private int Quantity;

    public Kitaab() {
    }

    public Kitaab(String kitaabId, String name, String author, String price, int quantity) {
        this.kitaabId = kitaabId;
        Name = name;
        Author = author;
        Price = price;
        Quantity = quantity;
    }
    public String getKitaabId() {
        return kitaabId;
    }

    public void setKitaabId(String kitaabId) {
        this.kitaabId = kitaabId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}
