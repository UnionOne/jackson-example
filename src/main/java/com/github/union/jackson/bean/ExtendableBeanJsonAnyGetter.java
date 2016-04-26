package com.github.union.jackson.bean;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class ExtendableBeanJsonAnyGetter {
    private String name;
    private Map<String, String> properties;

    public ExtendableBeanJsonAnyGetter(String name) {
        this.name = name;
        this.properties = new HashMap<>();
    }

    public void add(String key, String value) {
        this.properties.put(key, value);
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExtendableBeanJsonAnyGetter{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}
