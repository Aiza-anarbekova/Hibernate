package org.example;

import org.example.entity.Student;
import org.example.entity.Test1;
import org.hibernate.SessionFactory;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory session = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Test1.class)
                .buildSessionFactory();
    }

}
