package com.app.entities;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    int id;
    String name;
    String isbn;
    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;
}
