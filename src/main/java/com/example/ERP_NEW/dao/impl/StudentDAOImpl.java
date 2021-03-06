package com.example.ERP_NEW.dao.impl;

import com.example.ERP_NEW.beans.Student;
import com.example.ERP_NEW.dao.StudentDAO;
import com.example.ERP_NEW.util.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
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

        System.out.println("inside fetch function");
        try(Session session = SessionUtil.getSession())
        {

//            session.beginTransaction();
            String hql = "FROM Student";

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

    @Override
    public ArrayList<Student> fetchTT(Student student) {

        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println("inside fetch tt");
        try(Session session = SessionUtil.getSession())
        {


                 session.beginTransaction();
                 students = (ArrayList<Student>) session.createQuery("FROM Student where cgpa=4 ").list();
          //      query.setParameter("cgpa", student.getCgpa());
//                for (final Object fetch : query.list()) {
//                    return ArrayList<Student> fetch;
//                }
            return students;
            } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }


}


