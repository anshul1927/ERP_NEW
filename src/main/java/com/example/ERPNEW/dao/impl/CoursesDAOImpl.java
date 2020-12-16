package com.example.ERPNEW.dao.impl;

import com.example.ERPNEW.beans.Courses;
import com.example.ERPNEW.dao.CoursesDAO;
import com.example.ERPNEW.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class CoursesDAOImpl implements CoursesDAO {

    @Override
    public void addCourses(Courses course) {
        System.out.println("a5");

//        Session session = null;
//        Transaction txx = null ;
//        try{
//            session = sessionFactory.openSession();
//            tx = session.beginTransaction();
//        }
//        factory.openSession();
        try(Session session = SessionUtil.getSession()){
            System.out.println("a6");
            session.beginTransaction();
            System.out.println(course.getName());
            //Integer id = (Integer)
            session.save(course);
            System.out.println("Student created with id:");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }
    }
}
