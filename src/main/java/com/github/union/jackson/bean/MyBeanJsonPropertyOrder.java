package com.github.union.jackson.bean;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "id"})
public class MyBeanJsonPropertyOrder {
    private int id;
    private String name;

    public MyBeanJsonPropertyOrder() {
        this(1, "default");
    }

    public MyBeanJsonPropertyOrder(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "MyBeanJsonPropertyOrder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
