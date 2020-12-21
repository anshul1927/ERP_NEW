package com.example.ERPNEW.beans;

import javax.persistence.*;
import java.util.List;

@Entity

public class Student_Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinTable(name = "Courses", joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
            private List<Courses> courses;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinTable(name = "Students", joinColumns = {@JoinColumn(name = "student_id")},
    inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;


    public Student_Courses(List<Courses> courses, List<Student> students) {
        this.courses = courses;
        this.students = students;
    }

    public Student_Courses() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
