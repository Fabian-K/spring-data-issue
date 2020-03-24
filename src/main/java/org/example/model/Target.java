package org.example.model;


import javax.persistence.Entity;

@Entity
public class Target {
    @javax.persistence.Id
    String id;
    String field;
}
