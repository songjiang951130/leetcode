package com.github.songjiang951130.designpattern.prototype;

public class HomeWork implements Prototype {


    private String name;
    private String choice;
    private int grade;
    private String subject;

    public HomeWork(String name, String choice, int grade, String subject) {
        this.name = name;
        this.choice = choice;
        this.grade = grade;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[\"name\":" + name + ",[\"grade:\"" + grade + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public HomeWork clone() {
        try {
            HomeWork object = (HomeWork) super.clone();
            return object;

        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        HomeWork work = new HomeWork("作业制造机", "abc", 1, "math");
        HomeWork copy = work.clone();
        copy.setName("你的就是我的");
        System.out.println(work);
        System.out.println(copy);
    }
}
