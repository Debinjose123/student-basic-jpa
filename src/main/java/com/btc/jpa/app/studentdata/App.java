package com.btc.jpa.app.studentdata;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.btc.jpa.app.studentdata.model.*;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("student.pu");
        EntityManager manager=factory.createEntityManager();
        EntityTransaction trans=manager.getTransaction();
        //how 2 create data
//        Student s1=new Student(1,"Rithik",LocalDate.of(2000, 04, 06));
//        Student s2=new Student(2,"ithik",LocalDate.of(2001, 05, 07));
//        Student s3=new Student(3,"Rthik",LocalDate.of(2002, 06, 8));
//        Student s4=new Student(4,"Rihik",LocalDate.of(2003, 07, 9));
//        trans.begin();
//        manager.persist(s1);
//        manager.persist(s2);
//        manager.persist(s3);
//        manager.persist(s4);
//        trans.commit();
       
//        Student s=manager.find(Student.class, 2);
//        s.setStudentName("Debin");
//        trans.begin();
//        manager.persist(s);
//        trans.commit();
//        
        //how 2 delete data
//        Student s=manager.find(Student.class, 3);        
//        trans.begin();
//        manager.remove(s);
//        trans.commit();
//        
        //find data using name
//        TypedQuery<Student> findAll=manager.createQuery("from Student where studentId=:an",Student.class);
//        findAll.setParameter("an",1);
//        List<Student> students=findAll.getResultList();
//        students.forEach(p->System.out.println(p));
        
        //print all rows
         TypedQuery<Student> findAll=(TypedQuery<Student>) manager.createQuery("from Student");
        List<Student> students=findAll.getResultList();
        students.forEach(p->System.out.println(p));
       
    }
}
