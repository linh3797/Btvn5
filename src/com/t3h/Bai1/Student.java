package com.t3h.Bai1;


public class Student {
    private int id;
    private String name;
    private float score;

    public Student(int id, String name, float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }


    public String toString() {
        return id + "_" + name + "_" + score;
    }

    public float getScore() {
        return score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
