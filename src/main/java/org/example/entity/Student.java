package org.example.entity;

import javax.persistence.*;
// This class POJO class. Entity , save in DB in table. Entity class like a pojo class.
// Create 10 table with entity .

@Entity
@Table(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String name;
    private int age;

    public Student( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
