//package com.example.ERPNEW.beans;
//
//import javax.persistence.*;
//
//@Entity
//
//public class Student_Courses {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
//    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
//    private Courses course_id;
//    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
//    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
//    private Student student_id;
//
//
//    public Student_Courses(Integer id, Students student_id, Courses course_id) {
//        this.id = id;
//        this.student_id = student_id;
//        this.course_id = course_id;
//    }
//
//    public Student_Courses() {
//
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Students getStudent_id() {
//        return student_id;
//    }
//
//    public void setStudent_id(Students student_id) {
//        this.student_id = student_id;
//    }
//
//    public Courses getCourse_id() {
//        return course_id;
//    }
//
//    public void setCourse_id(Courses course_id) {
//        this.course_id = course_id;
//    }
//}
