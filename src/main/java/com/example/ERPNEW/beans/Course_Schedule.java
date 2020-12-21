package com.example.ERPNEW.beans;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class Course_Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Courses course_id;
    @Column(nullable = false)
    private Time time;
    @Column(nullable = false)
    private String day;
    @Column(nullable = false)
    private Integer room;
    private Integer building;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Courses getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Courses course_id) {
        this.course_id = course_id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public Course_Schedule(Integer id, Courses course_id, Time time, String day, Integer room, Integer building) {
        this.id = id;
        this.course_id = course_id;
        this.time = time;
        this.day = day;
        this.room = room;
        this.building = building;
    }


}