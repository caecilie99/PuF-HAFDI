package com.hafdiserver.model;

import javax.persistence.*;


/**
 * Created by Birgit on 31.10.2016.
 */

@Entity
public class Schiff {

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    public Schiff(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
