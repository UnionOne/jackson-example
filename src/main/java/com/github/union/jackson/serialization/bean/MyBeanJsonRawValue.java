package com.github.union.jackson.serialization.bean;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class MyBeanJsonRawValue {
    private String name;

    @JsonRawValue
    private String json;

    public MyBeanJsonRawValue(String json, String name) {
        this.json = json;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "MyBeanJsonRawValue{" +
                "name='" + name + '\'' +
                ", json='" + json + '\'' +
                '}';
    }
}
