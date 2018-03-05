package com.example.hongv.englishvocabulary.model;

import java.io.Serializable;

/**
 * Created by hongv on 1/26/2018.
 */

public class Topic implements Serializable{
    private int id;
    private  String name;

    public Topic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
