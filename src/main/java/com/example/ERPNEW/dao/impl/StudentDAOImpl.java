package com.example.ERPNEW.dao.impl;

import com.example.ERPNEW.beans.Courses;
import com.example.ERPNEW.beans.Student;
import com.example.ERPNEW.dao.CoursesDAO;
import com.example.ERPNEW.dao.StudentDAO;
import com.example.ERPNEW.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;


public class StudentDAOImpl implements StudentDAO {
    @Override
    public void addStudent(Student student) {
        try (Session session = SessionUtil.getSession()) {
            System.out.println("a6");
            session.beginTransaction();
            System.out.println(student.getFirst_name());
            //Integer id = (Integer)
            session.save(student);
            System.out.println("Student created with id:");
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }
    }

    @Override
    public void fetchStudent()
    {
        Transaction tx = null;
        System.out.println("inside fetch function");
        try(Session session = SessionUtil.getSession())
        {

            tx=session.beginTransaction();
            String hql = "SELECT cgpa FROM student";

            Query query = session.createQuery(hql);
            System.out.println("query::::");
            List results = query.list();
            for (Iterator iterator = results.iterator(); iterator.hasNext();){
                Student student1 = (Student) iterator.next();
                System.out.print("cgpa" + student1.getCgpa());

            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.out.println("hii");
            e.printStackTrace();
        }

        }

}


