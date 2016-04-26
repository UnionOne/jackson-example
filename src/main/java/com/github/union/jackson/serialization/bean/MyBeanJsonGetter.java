package com.github.union.jackson.serialization.bean;

import com.fasterxml.jackson.annotation.JsonGetter;

public class MyBeanJsonGetter {
    private int id;
    private String name;

    public MyBeanJsonGetter(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyBeanJsonGetter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
