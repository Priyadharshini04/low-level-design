package com.lld.patterns.creation.prototype;


public class Student implements Cloneable {
    private String name;
    private float marks;
    private School school;

    public Student(String name, float marks, School school) {
        this.name = name;
        this.marks = marks;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    // Deep Cloning
    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            student.school = school.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

//    Shallow Cloning.
//    @Override
//    public Student clone() {
//        try {
//            Student clone = (Student) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}
