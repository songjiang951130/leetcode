package com.github.songjiang951130.designpattern.builder;

public class Person {
    private int id;
    private String name;
    private int score;

    public Person(int id, String name, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static class PersonBuilder {
        //---复制外部类的属性
        private String name;
        private int id;
        private int score;
        //---

        public PersonBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder score(int score) {
            this.score = score;
            return this;
        }

        public Person builder() {
            return new Person(this.id, this.name, this.score);
        }
    }
}
