package com.itheima.pratice;

public class Teacher {
    private String name;
    private int age;
    private double score;
    private Student student;

    public Teacher() {
    }

    public Teacher(String name, int age, double score, Student student) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
