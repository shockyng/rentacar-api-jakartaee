package com.shockyng.rentacar.api.domain.entities;

public class Car {

    private Long id;
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
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
}
