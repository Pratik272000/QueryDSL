package com.app.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String contactNo;
    @OneToMany(mappedBy = "author")
    List<Book> books;
}
