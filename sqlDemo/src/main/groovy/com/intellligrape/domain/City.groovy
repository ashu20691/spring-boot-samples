package com.intellligrape.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
public class City implements Serializable {

    @Id
    @GeneratedValue
    Long id

    @Column(nullable = false)
    String name

    @Column(nullable = false)
    String state;

    protected City() {}

    public City(String name, String state) {
        this.name = name
        this.state = state
    }
}