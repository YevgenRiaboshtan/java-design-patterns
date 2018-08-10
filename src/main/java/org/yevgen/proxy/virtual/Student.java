package org.yevgen.proxy.virtual;

public class Student {
    private String name;
    private String surname;
    private int score;

    public Student() {
    }

    public Student(String name, String surname, int score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; Surname: " + surname + "; Score: " + score;
    }
}
