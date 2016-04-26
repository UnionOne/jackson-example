package com.github.union.jackson.serialization.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

public class Event {
    private String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    private Date eventDate;

    public Event(String name, Date eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}
