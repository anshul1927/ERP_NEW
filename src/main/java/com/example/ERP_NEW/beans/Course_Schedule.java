package com.example.ERP_NEW.beans;

import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Course_Schedule")
public class Course_Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String time;
    @Column(nullable = false)
    private String day;
    @Column(nullable = false)
    private String room;
    @Column
    private String building;

//    @OneToMany(mappedBy = "course_schedule",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
//    private List<Courses> courses = new ArrayList<>();



    public Course_Schedule(String time, String day, String room, String building) {
        this.time = time;
        this.day = day;
        this.room = room;
        this.building = building;

    }

    public Course_Schedule() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

   }