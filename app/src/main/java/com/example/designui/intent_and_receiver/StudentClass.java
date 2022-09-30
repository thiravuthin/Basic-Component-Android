package com.example.designui.intent_and_receiver;

import java.io.Serializable;

public class StudentClass implements Serializable {
    int id;
    String name;

    public StudentClass(int id, String name) {
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
}
