package edu.isu.cs.cs2263;

import java.util.ArrayList;

public class Student {

    private String firstName;

    private String lastName;

    private ArrayList<Course> courses = new ArrayList<>();

    public Student(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }

    public Course[] getCourses(){
        return (Course[]) courses.toArray();
    }

    public String toString(){
        return null;
    }
}
