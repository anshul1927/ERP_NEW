//package com.example.ERP_NEW.beans;
//
//
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//public class Course_Domain {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
//    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
//    private List<Courses> course_id;
//    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
//    @JoinColumn(name = "domain_id", referencedColumnName = "domain_id")
//    private List<Domain> domain_id;
//
//    public Course_Domain() {
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
//    public List<Courses> getCourse_id() {
//        return course_id;
//    }
//
//    public void setCourse_id(List<Courses> course_id) {
//        this.course_id = course_id;
//    }
//
//    public List<Domain> getDomain_id() {
//        return domain_id;
//    }
//
//    public void setDomain_id(List<Domain> domain_id) {
//        this.domain_id = domain_id;
//    }
//
//    public Course_Domain(Integer id, List<Courses> course_id, List<Domain> domain_id) {
//        this.id = id;
//        this.course_id = course_id;
//        this.domain_id = domain_id;
//    }
//}
