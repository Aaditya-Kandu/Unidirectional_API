package com.example.SQL_Rocks;

import jakarta.persistence.*;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int writtenBook;

    private String country;

    private int age;

    public Author(int id, String name, int writtenBook, String country, int age) {

        this.id = id;
        this.name = name;
        this.writtenBook = writtenBook;
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWrittenBook() {
        return writtenBook;
    }

    public void setWrittenBook(int writtenBook) {
        this.writtenBook = writtenBook;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
