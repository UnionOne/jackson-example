package com.github.union.jackson.serialization.bean;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "user")
public class MyBeanJsonRootName {
    private int id;
    private String name;

    public MyBeanJsonRootName(int id, String name) {
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
        return "MyBeanJsonRootName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
