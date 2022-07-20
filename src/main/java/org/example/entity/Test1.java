package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "test_name",length = 55)
    private String testName;

    public Test1() {

    }

    public Test1(String testName) {
        this.testName = testName;
    }

}
