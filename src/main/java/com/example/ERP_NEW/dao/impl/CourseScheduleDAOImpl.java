package com.example.ERP_NEW.dao.impl;

import com.example.ERP_NEW.beans.Course_Schedule;
import com.example.ERP_NEW.beans.Courses;
import com.example.ERP_NEW.dao.CourseScheduleDAO;
import com.example.ERP_NEW.dao.CoursesDAO;
import com.example.ERP_NEW.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CourseScheduleDAOImpl implements CourseScheduleDAO {
    @Override
    public void addCourseSchedule(Course_Schedule course_schedule) {
        try(Session session = SessionUtil.getSession()){
            System.out.println("a6");
            session.beginTransaction();

            session.save(course_schedule);
            System.out.println("Course Schedule created with id:");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }
    }
}
